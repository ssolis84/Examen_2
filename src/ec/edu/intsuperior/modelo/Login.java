/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Santiago
 */

//SSOLIS
public class Login {
    private String user;
    private String password;

    public Login() {
    }

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
    
    
    
}
