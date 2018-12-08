package Exceptions;

/**
 *
 * @author DIDIM
 */
public class WheatControlException extends Exception {

    public WheatControlException() {
    }

    public WheatControlException(String message) {
        super(message);
    }

    public WheatControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public WheatControlException(Throwable cause) {
        super(cause);
    }

    public WheatControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
