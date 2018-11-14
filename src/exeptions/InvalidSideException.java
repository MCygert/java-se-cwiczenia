package exeptions;

public class InvalidSideException extends InvalidValueException{
    private String message = "Given Value have bad parameter";
 //Ovverding getMessage method to send our message
    @Override
    public String getMessage() {
        return message;
    }
}
