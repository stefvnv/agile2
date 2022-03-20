public class GradingExceptionHandler extends Exception {
    private String message = "";

    public GradingExceptionHandler(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
