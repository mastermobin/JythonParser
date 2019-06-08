package Models;

import Models.Basic.VariableRes;

import java.util.ArrayList;
import java.util.List;

public class Tracer {

    public enum RefType {
        METHOD,
        VARIABLE,
        ARRAY
    }

    public static class Ring {
        private RefType refType;
        private String name;

        public Ring(RefType refType, String name) {
            this.refType = refType;
            this.name = name;
        }

        public Ring(RefType refType) {
            this.refType = refType;
        }

        public RefType getRefType() {
            return refType;
        }

        public String getName() {
            return name;
        }
    }

    private List<Ring> chain = new ArrayList<>();

    public Tracer() {
    }

    public ValidationResult validate(Node node, int line, String fileName, List<String> params) {
        Node it = node;
        String varType = null;
        boolean first = true;
        VariableRes lastRes = null;
        String lastName = "Here";
        for (Ring ring : chain) {
            if (ring.getRefType() == RefType.ARRAY) {
                if (!lastRes.isArray()){
                    ValidationResult res = new ValidationResult(false);
                    res.setError(Error.error111(line, lastRes.getType(), fileName));
                    return res;
                }else{
                    lastRes.setArray(false);
                }
            }
            else if(ring.getRefType() == RefType.VARIABLE && lastRes != null && lastRes.isArray()){
                ValidationResult res = new ValidationResult(false);
                res.setError(new Error(line, "Select an element of array before use", fileName, 113));
                return res;
            }
            else if (it == null) {
                ValidationResult res = new ValidationResult(false);
                if (varType.equals(varType.toLowerCase())) {
                    res.setError(Error.error109(line, lastName, fileName, varType));
                } else {
                    res.setError(Error.error110(line, varType, fileName));
                }
                return res;
            }
            else if (ring.name.equals("self")) {
                it = it.parent;
            } else if (ring.getRefType() == RefType.VARIABLE) {
                lastRes = it.getVariable(ring.name);
                if (lastRes == null) {
                    ValidationResult res = new ValidationResult(false);
                    res.setError(Error.error108(line, ring.name, fileName, lastName));
                    if (first && node.parent != Node.getRoot())
                        return validate(node.parent, line, fileName, params);
                    else
                        return res;
                }
                else {
                    varType = lastRes.getType();
                    it = Node.getClassTable().getClassNode(varType);
                }
            } else if (ring.getRefType() == RefType.METHOD) {
                varType = it.getMethod(ring.name, params);
                if (varType == null) {
                    ValidationResult res = new ValidationResult(false);
                    res.setError(Error.error105(line, ring.name, fileName, lastName, params));
                    if (first && node.parent != Node.getRoot())
                        return validate(node.parent, line, fileName, params);
                    else
                        return res;
                } else {
                    it = Node.getClassTable().getClassNode(varType);
                }
            }
            if (ring.getRefType() != RefType.ARRAY)
                lastName = ring.name;
            first = false;
        }
        ValidationResult res = new ValidationResult(true);
        res.setType(varType);
        return res;
    }

    public void addRing(Ring ring) {
        chain.add(ring);
    }

    public List<Ring> getChain() {
        return chain;
    }
}
