package Models.Basic;

public class VariableRes {
    String type;
    boolean array;

    public VariableRes(String type, boolean array) {
        this.type = type;
        this.array = array;
    }

    public String getType() {
        return type;
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }
}
