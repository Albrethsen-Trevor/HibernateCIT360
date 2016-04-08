/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talbrethsen;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

@ManagedBean
@SessionScoped

/**
 *
 * @author trevoralbrethsen
 */
public class DataCIT360 {
    
    private Members m;
    private HibernateUtilCIT360 helper;
    private Session session;
    
    public void addMember() {
        m = new Members("Evan");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
    }
    
}
