/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Alain Lozano, Ilia Consuegra
 */
public class ConnectionErrorException extends Exception {

    /**
     * Constructs an instance of <code>ConnectionErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ConnectionErrorException() {
        super("It was implossible to connect to the server.");
    }
}
