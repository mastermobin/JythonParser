package Models.Basic;

public class Property {
    private String type;
    private String name;
    private Class cls;
    private String fileName;
    private int line;
    private boolean array = false;

    public Property(String type, String name, Class cls, int line, String fileName) {
        this.type = type;
        this.name = name;
        this.cls = cls;
        this.fileName = fileName;
        this.line = line;
    }

    public Property(String type, String name, Class cls, int line, String fileName, boolean array) {
        this.type = type;
        this.name = name;
        this.cls = cls;
        this.fileName = fileName;
        this.line = line;
        this.array = array;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
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

    public boolean isArray() {
        return array;
    }
}
