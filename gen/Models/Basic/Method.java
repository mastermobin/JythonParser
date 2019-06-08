package Models.Basic;

import java.util.ArrayList;
import java.util.List;

public class Method {
    String name;
    String returnType;
    Class cls;
    String fileName;
    int line;
    List<Variable> variables = new ArrayList<>();

    public Method(String name, String returnType, Class cls, int line, String fileName) {
        this.name = name;
        this.returnType = returnType;
        this.cls = cls;
        this.line = line;
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public String getReturnType() {
        return returnType;
    }

    public Class getCls() {
        return cls;
    }

    public String getFileName() {
        return fileName;
    }

    public int getLine() {
        return line;
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void addParameter(Variable variable) {
        variables.add(variable);
    }
}
