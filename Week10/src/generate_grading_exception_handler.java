public class generate_grading_exception_handler extends Throwable {
    String message;

    public generate_grading_exception_handler(String errMessage){
        message = errMessage;
    }

    public String getMessage() {
        return message;
    }
}
