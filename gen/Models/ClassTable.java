package Models;

import Models.Basic.Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTable {

    public class Class {
        private List<Models.Basic.Class> classes = new ArrayList<>();

        void addClass(Models.Basic.Class cls){
            classes.add(cls);
        }

        List<Error> errorCheck(){
            List<Error> errors = new ArrayList<>();
            if(classes.size() > 1){
                for(int i = 1; i < classes.size(); i++){
                    Models.Basic.Class item = classes.get(i);
                    errors.add(Error.error101(item.getLine(), item.getName(), item.getFileName()));
                }
            }

            for (Models.Basic.Class item : classes) {
                if (!item.hasMainFunc())
                    errors.add(Error.error104(item.getName(), item.getFileName()));
            }

            return  errors;
        }

        Node getClassNode(){
            if(classes.size() == 1)
                return classes.get(0).getNode();
            return null;
        }
    }

    private HashMap<String, Class> classes = new HashMap<>();

    public void addClass(Models.Basic.Class cls){
        if(!classes.containsKey(cls.getName()))
            classes.put(cls.getName(), new Class());

        classes.get(cls.getName()).addClass(cls);
    }

    public List<Error> errorCheck(){
        List<Error> errors = new ArrayList<>();
        for(Map.Entry<String, Class> pair : classes.entrySet())
            errors.addAll(pair.getValue().errorCheck());

        return errors;
    }

    Node getClassNode(String className){
        if(classes.containsKey(className))
            return classes.get(className).getClassNode();
        return null;
    }
}
