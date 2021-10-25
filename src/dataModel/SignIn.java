/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModel;

import java.time.LocalDateTime;

/**
 *
 * @author Alain Lozano,Ilia Consuegra
 */
public class SignIn {
    private int id;
    private LocalDateTime lastSignIn;
    private int userId;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the lastSignIn
     */
    public LocalDateTime getLastSignIn() {
        return lastSignIn;
    }

    /**
     * @param lastSignIn the lastSignIn to set
     */
    public void setLastSignIn(LocalDateTime lastSignIn) {
        this.lastSignIn = lastSignIn;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
    
}
