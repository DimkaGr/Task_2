package by.epam.task.validate;

public class ValidationException extends Exception{
    ValidationException() {
        System.err.println("Your data is not valid");
    }
}
