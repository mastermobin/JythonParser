package Models;

import Models.Basic.Method;
import Models.Basic.Property;
import Models.Basic.Variable;
import Models.Basic.VariableRes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
    private static Node root = new Node();
    private static ClassTable classTable = new ClassTable();
    private HashMap<String, Value> table = new HashMap<>();
    public List<Node> nodes = new ArrayList<>();
    public Node parent;
    private String label;
    private int moveMemory = 0;

    private Node(){
        parent = this;
    }

    public Node(Node node, String label){
        node.addChild(this);
        parent = node;
        this.label = label;
    }

    public static Node getRoot() {
        return root;
    }

    public static ClassTable getClassTable() {
        return classTable;
    }

    public String getLabel() {
        return label;
    }

    private void addChild(Node node){
        nodes.add(node);
    }

    public void addVariable(Variable variable){
        if(!table.containsKey(variable.getName()))
            table.put(variable.getName(), new Value());

        table.get(variable.getName()).addVariable(variable);
    }

    public void addProperty(Property property){
        if(!table.containsKey(property.getName()))
            table.put(property.getName(), new Value());

        table.get(property.getName()).addProperty(property);
    }

    public void addMethod(Method method){
        if(!table.containsKey(method.getName()))
            table.put(method.getName(), new Value());

        table.get(method.getName()).addMethod(method, (List<Variable>) ((ArrayList<Variable>)method.getVariables()).clone());
    }

    public List<Error> errorCheck(){
        List<Error> errors = new ArrayList<>();

        for(Map.Entry<String, Value> pair : table.entrySet())
            errors.addAll(pair.getValue().errorCheck());

        for(Node node : nodes)
            errors.addAll(node.errorCheck());

        return errors;
    }

    public Node move(){
        if(moveMemory == nodes.size())
            return parent;
        else
            return nodes.get(moveMemory++);
    }

    VariableRes getVariable(String name){
        if(table.containsKey(name))
            return table.get(name).getVariable();
        return null;
    }

    public String getMethod(String name, List<String> params){
        if(table.containsKey(name)) {
            Object t = ((ArrayList<String>) params).clone();
            return table.get(name).getMethod((List<String>) t);
        }
        return null;
    }
}
