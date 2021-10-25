/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModel;

import java.io.Serializable;

/**
 *
 * @author Alain Lozano,Matteo Fernandez,Ilia Consuegra
 */
public class DataEncapsulation implements Serializable{
    
    private User user;
    private MessageEnum message;

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the message
     */
    public MessageEnum getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(MessageEnum message) {
        this.message = message;
    }
    
    
    
    
}
