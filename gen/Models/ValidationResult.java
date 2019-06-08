package Models;

public class ValidationResult {
    private Error error;
    private String type;
    private boolean success;

    public ValidationResult(boolean success) {
        this.success = success;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Error getError() {
        return error;
    }

    public String getType() {
        return type;
    }

    public boolean isSuccess() {
        return success;
    }
}
