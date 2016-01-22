/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.query;

import com.entity.Login;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fred
 */
public class DataQuery {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public DataQuery(){
        emf = Persistence.createEntityManagerFactory("cvaultPU");
        em  = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    public boolean loginControl(String username , String password){
        try {
            //Login l = em.createNamedQuery("Login.control", Login.class).setParameter("username", username).setParameter("password", password);
            Login l = em.createNamedQuery("Login.control", Login.class).setParameter("username", username).setParameter("password", password).getSingleResult();
            if (l != null){
                return true;                
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        
    }    
    
}
