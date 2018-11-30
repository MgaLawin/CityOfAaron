/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Jeremy
 */
public class LandControlException extends Exception {

    public LandControlException() {
    }

    public LandControlException(String message) {
        super(message);
    }

    public LandControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public LandControlException(Throwable cause) {
        super(cause);
    }

    public LandControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
