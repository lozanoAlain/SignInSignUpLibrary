/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModel;

import exceptions.ConnectionErrorException;
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
     * @throws ConnectionErrorException
     */
    public User signIn(User user) throws UserNotExistException, IncorrectPasswordException,ConnectionErrorException,Exception;

    /**
     *
     * @param user
     * @throws ExistUserException 
     * @throws ConnectionErrorException 
     */
    public void signUp(User user) throws ExistUserException,ConnectionErrorException,Exception;

}
