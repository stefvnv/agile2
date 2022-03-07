public class CostCalculatorExceptionHandler extends Exception {

    String message;

    public CostCalculatorExceptionHandler(String errMessage) {
        message = errMessage;
    }

    public String getMessage() {
        return message;
    }
}