package Models.Basic;

public class Variable {
    private String type;
    private String name;
    private boolean array = false;
    private int line;
    private String fileName;

    public Variable(String type, String name, int line, String fileName) {
        this.type = type;
        this.name = name;
        this.fileName = fileName;
        this.line = line;
    }

    public Variable(String type, String name, int line, String fileName, boolean array) {
        this.type = type;
        this.name = name;
        this.array = array;
        this.line = line;
        this.fileName = fileName;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isArray() {
        return array;
    }

    public String getFileName() {
        return fileName;
    }

    public int getLine() {
        return line;
    }
}
