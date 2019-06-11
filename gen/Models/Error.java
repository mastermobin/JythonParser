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
        if(!params.isEmpty()) {
            args.deleteCharAt(args.length() - 1);
            args.deleteCharAt(args.length() - 1);
        }
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

    static Error error113(int line, String name, String fileName) {
        String message = String.format("Error 113: in line %d, Select an element of array %s before use", line, name);
        return new Error(line, message, fileName, 113);
    }

    public static Error error115(int line, String fileName, String all) {
        String message = String.format("Error 115: in line %d, One of operators type is Unknown in %s", line, all);
        return new Error(line, message, fileName, 115);
    }

    public static Error error210(int line, String fileName) {
        String message = String.format("Error 210: in line %d, Size of an array must be of type integer", line);
        return new Error(line, message, fileName, 210);
    }

    public static Error error220(int line, String fileName) {
        String message = String.format("Error 220: in line %d, Condition type must be Boolean.", line);
        return new Error(line, message, fileName, 220);
    }

    public static Error error230(int line, String fileName, String returnType) {
        String message = String.format("Error 230: in line %d, ReturnType of this method must be %s.", line, returnType);
        return new Error(line, message, fileName, 230);
    }

    public static Error error231(int line, String fileName) {
        String message = String.format("Error 230: in line %d, void methods can't return value.", line);
        return new Error(line, message, fileName, 231);
    }

    public static Error error250(int line, String right, String left, String fileName) {
        String message = String.format("Error 250: in line %d, Incompatible types: %s can not be converted to %s.", line, left, right);
        return new Error(line, message, fileName, 250);
    }

    public static Error error270(int line, String fileName) {
        String message = String.format("Error 270: in line %d, Type of parameter of print built-in function must be integer, string ,float or boolean.", line);
        return new Error(line, message, fileName, 270);
    }

    public static Error error280(int line, String operator, String operandA, String operandB, String fileName) {
        String message = String.format("Error 114: in line %d, Can not use operator %s on %s & %s", line, operator, operandA, operandB);
        return new Error(line, message, fileName, 280);
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
        String message = String.format("Error 112: in line %d, Method %s%s call can't handle due Unknown type of args", line, name, args.toString());
        return new Error(line, message, fileName, 112);
    }

}
