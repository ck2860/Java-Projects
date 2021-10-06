package Homework19;

public class AnagramException extends Exception{
    /**
     * This is a custom checked exception that extended from exception class.
     * The super constructor is called.
     * @param message a String message
     * @param cause a Throwable cause
     */
    public AnagramException(String message, Throwable cause){
        super(message, cause);
    }
}
