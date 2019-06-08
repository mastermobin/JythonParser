package Models;

import java.util.List;

public class Error {
    public String fileName;
    public int line;
    public String message;
    public int errorNumber;

    public Error(int line, String message, String fileName, int errorNumber) {
        this.line = line;
        this.message = message;
        this.fileName = fileName;
        this.errorNumber = errorNumber;
    }

    static Error error101(int line, String className, String fileName) {
        String message = String.format("Error 101: in line %d, %s has been defined already", line, className);
        return new Error(line, message, fileName, 101);
    }

    static Error error102(int line, String className, String name, String fileName) {
        String message = String.format("Error 102: in line %d, %s has been defined already in %s", line, name, className);
        return new Error(line, message, fileName, 102);
    }

    static Error error103(int line, String name, String fileName) {
        String message = String.format("Error 103: in line %d, %s has been defined already in current scope", line, name);
        return new Error(line, message, fileName, 103);
    }

    static Error error104(String className, String fileName) {
        String message = String.format("Error 104: in class %s, Can not find main method", className);
        return new Error(0, message, fileName, 104);
    }

    static Error error105(int line, String name, String fileName, String par, List<String> params) {
        StringBuilder args = new StringBuilder("(");
        for(String param : params){
            args.append(param);
            args.append(", ");
        }
        args.deleteCharAt(args.length() - 1);
        args.deleteCharAt(args.length() - 1);
        args.append(")");
        String message = String.format("Error 105: in line %d, Can not find Method %s%s in %s", line, name, args.toString(), par);
        return new Error(line, message, fileName, 105);
    }

    static Error error106(int line, String name, String fileName) {
        String message = String.format("Error 106: in line %d, %s has been defined already in current scope", line, name);
        return new Error(line, message, fileName, 106);
    }

    static Error error107(int line, String name, String fileName) {
        String message = String.format("Error 107: in line %d, %s has been defined already in current scope", line, name);
        return new Error(line, message, fileName, 107);
    }

    static Error error108(int line, String name, String fileName, String par) {
        String message = String.format("Error 108: in line %d, Can not find Variable %s in %s", line, name, par);
        return new Error(line, message, fileName, 108);
    }

    static Error error109(int line, String name, String fileName, String varType) {
        String message = String.format("Error 109: in line %d, Primary data types like %s(%s) don't contain properties", line, varType, name);
        return new Error(line, message, fileName, 109);
    }

    static Error error110(int line, String name, String fileName) {
        String message = String.format("Error 110: in line %d, Class %s not found", line, name);
        return new Error(line, message, fileName, 110);
    }

    static Error error111(int line, String name, String fileName) {
        String message = String.format("Error 111: in line %d, Operator [] only allowed on arrays not %s", line, name);
        return new Error(line, message, fileName, 111);
    }

    public static Error error112(int line, String name, String fileName, List<String> params) {
        StringBuilder args = new StringBuilder("(");
        for(String param : params){
            args.append(param);
            args.append(", ");
        }
        args.deleteCharAt(args.length() - 1);
        args.deleteCharAt(args.length() - 1);
        args.append(")");
        String message = String.format("Error 112: in line %d, Method %s%s call can't handle due unknown type of args", line, name, args.toString());
        return new Error(line, message, fileName, 112);
    }

}