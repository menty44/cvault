/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.query.DataQuery;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author fred
 */
@ManagedBean(name ="registration")
@SessionScoped
public class RegistrationController implements Serializable{
    
    public  String first_name;
    public  String Second_name;
    
    public DataQuery query = new DataQuery();
    
    public String RegistrationControl(){
        return "";
        
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return Second_name;
    }

    public void setSecond_name(String Second_name) {
        this.Second_name = Second_name;
    }
    
    
    
}
