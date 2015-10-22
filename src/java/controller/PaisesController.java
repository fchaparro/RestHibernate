/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.List;
import model.Paises;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Fredy
 */
public class PaisesController implements CRUDInterface<Paises> {
    
    SessionFactory sf;
    Session session;
    
    public PaisesController() {
        sf = NewHibernateUtil.getSessionFactory();
        session = sf.openSession();
    }
    
    @Override
    public Paises getObjeto(Serializable id) {
        return (Paises) session.get(Paises.class, id);
    }
    
    @Override
    public void saveObjeto(Paises obj) {
        Transaction tx = session.beginTransaction();
        if (obj.getIdPais() != 0) {
            session.merge(obj);
        } else {
            session.saveOrUpdate(obj);
        }
        tx.commit();
    }
    
    @Override
    public void deleteObjeto(Serializable id) {
        Transaction tx = session.beginTransaction();
        session.delete(session.get(Paises.class, id));
        tx.commit();;
    }
    
    @Override
    public List<Paises> getAll() {
        return session.createQuery("from Paises").list();
    }
    
}
