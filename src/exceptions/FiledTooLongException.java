/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Alain Lozano,Ilia Consuegra
 */
public class FiledTooLongException extends Exception {

    /**
     * Constructs an instance of <code>FiledTooLongException</code> with the
     * specified detail message.
     *
     */
    public FiledTooLongException() {
        super("The field is too long (255 character max).");
    }
}
