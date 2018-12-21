package by.epam.task.validate;

public class ValidationException extends Exception {
    public ValidationException() {
        super("Data is not valid");
    }

    public ValidationException(String message) {
        super(message);
    }
}
