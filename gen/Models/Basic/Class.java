package Models.Basic;

import Models.Node;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String name;
    private String parent;
    private String fileName;
    private Node node;
    private int line;
    private boolean mainFunc = false;
    private List<Property> properties = new ArrayList<>();
    private List<Constructor> constructors = new ArrayList<>();
    private List<Method> methods = new ArrayList<>();

    public Class(String name, int line, String fileName, Node node) {
        this.name = name;
        this.line = line;
        this.fileName = fileName;
        this.node = node;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void addProperty(Property property){
        properties.add(property);
    }

    public void addConstructor(Constructor constructor){
        constructors.add(constructor);
    }

    public void addMethod(Method method){
        if(method.getName().equals("main"))
            mainFunc = true;
        methods.add(method);
    }

    public String getName() {
        return name;
    }

    public String getFileName() {
        return fileName;
    }

    public int getLine() {
        return line;
    }

    public Node getNode() {
        return node;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public List<Constructor> getConstructors() {
        return constructors;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public boolean hasMainFunc() {
        return mainFunc;
    }
}
