package Models;

import Models.Basic.Property;
import Models.Basic.Variable;
import Models.Basic.VariableRes;

import java.util.ArrayList;
import java.util.List;

class Value extends ParamMethod {
    private List<Property> properties = new ArrayList<>();
    private List<Variable> variables = new ArrayList<>();

    void addVariable(Variable variable){
        variables.add(variable);
    }

    void addProperty(Property property){
        properties.add(property);
    }

    VariableRes getVariable(){
        if(variables.size() == 1)
            return new VariableRes(variables.get(0).getType(), variables.get(0).isArray());
        else if(properties.size() == 1)
            return new VariableRes(properties.get(0).getType(), properties.get(0).isArray());
        return null;
    }

    List<Error> errorCheck(){
        List<Error> errors = propertyErrorCheck();
        errors.addAll(variableErrorCheck());
        errors.addAll(methodErrorCheck());
        return errors;
    }

    private List<Error> propertyErrorCheck(){
        List<Error> errors = new ArrayList<>();
        if(properties.size() > 1){
            for(int i = 1; i < properties.size(); i++){
                Property item = properties.get(i);
                errors.add(Error.error102(item.getLine(), item.getCls().getName(), "Property " + item.getName(), item.getFileName()));
            }
        }

        return errors;
    }

    private List<Error> variableErrorCheck(){
        List<Error> errors = new ArrayList<>();
        if(variables.size() > 1){
            for(int i = 1; i < variables.size(); i++){
                Variable item = variables.get(i);
                errors.add(Error.error103(item.getLine(), item.getName(), item.getFileName()));
            }
        }

        return errors;
    }
}
