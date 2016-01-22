/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.query.DataQuery;
//import com.sun.faces.facelets.Facelet;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author fred
 */

@ManagedBean(name ="login")
//@ManagedBean(name = "registration")
@SessionScoped
public class LoginController implements Serializable{
    
    public String message = "Username or Password Invalid !!! Please enter the correct Credentials ";
    private String username;
    private String password;
    private String first_name;
    private DataQuery query = new DataQuery();
    
    public String loginControl() {
        if(query.loginControl(username, password)){
            return "home.xhtml?faces-redirect=true";
        }
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",  message));
        return "";       
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
          
}
