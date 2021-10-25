/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModel;

import exceptions.ExistUserException;
import exceptions.IncorrectPasswordException;
import exceptions.UserNotExistException;

/**
 *
 * @author Alain Lozano,Ilia Consuegra
 */
public interface Signable {

    /**
     *
     * @param user
     * @throws UserNotExistException
     * @throws IncorrectPasswordException
     */
    public void signIn(User user) throws UserNotExistException, IncorrectPasswordException;

    /**
     *
     * @param user
     * @throws ExistUserException 
     */
    public void signUp(User user) throws ExistUserException;

}
