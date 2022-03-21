public class LeapExceptionHandler extends Exception{
    private String message = "";

    public LeapExceptionHandler(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
