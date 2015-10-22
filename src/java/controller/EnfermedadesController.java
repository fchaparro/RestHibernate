/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.List;
import model.Enfermedades;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Fredy
 */
public class EnfermedadesController implements CRUDInterface<Enfermedades> {
    
    SessionFactory sf;
    Session session;
    
    public EnfermedadesController() {
        sf = NewHibernateUtil.getSessionFactory();
        session = sf.openSession();
    }
    
    @Override
    public Enfermedades getObjeto(Serializable id) {
        return (Enfermedades) session.get(Enfermedades.class, id);
    }
    
    @Override
    public void saveObjeto(Enfermedades obj) {
        Transaction tx = session.beginTransaction();
        if (obj.getIdEnfermedades() != 0) {
            session.merge(obj);
        } else {
            session.saveOrUpdate(obj);
        }
        tx.commit();
    }
    
    @Override
    public void deleteObjeto(Serializable id) {
        Transaction tx = session.beginTransaction();
        session.delete(session.get(Enfermedades.class, id));
        tx.commit();;
    }
    
    @Override
    public List<Enfermedades> getAll() {
        return session.createQuery("from Enfermedades").list();
    }
    
}
