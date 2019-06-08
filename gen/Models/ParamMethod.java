package Models;

import Models.Basic.Method;
import Models.Basic.Variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ParamMethod {
    private List<Method> methods = new ArrayList<>();
    private HashMap<String, ParamMethod> mTree = new HashMap<>();

    String getMethod(List<String> params){
        if(params.isEmpty()) {
            if (methods.size() == 1)
                return methods.get(0).getReturnType();
            return null;
        }else{
            String parameter = params.get(0);
            params.remove(0);
            if(mTree.containsKey(parameter))
                return mTree.get(parameter).getMethod(params);
            return  null;
        }
    }

    void addMethod(Method method, List<Variable> params){
        if(params.isEmpty()) {
            methods.add(method);
            return;
        }

        String varType = params.get(0).getType();
        params.remove(0);
        if(!mTree.containsKey(varType))
            mTree.put(varType, new ParamMethod());

        mTree.get(varType).addMethod(method, params);
    }

    List<Error> methodErrorCheck(){
        List<Error> errors = new ArrayList<>();
        if(methods.size() > 1){
            for(int i = 1; i < methods.size(); i++){
                Method item = methods.get(i);
                errors.add(Error.error102(item.getLine(), item.getCls().getName(),"Method " + item.getName(), item.getFileName()));
            }
        }

        for(Map.Entry<String, ParamMethod> pair : mTree.entrySet())
            errors.addAll(pair.getValue().methodErrorCheck());

        return errors;
    }
}

