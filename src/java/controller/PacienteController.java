/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.List;
import model.Paciente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Fredy
 */
public class PacienteController implements CRUDInterface<Paciente> {
    
    SessionFactory sf;
    Session session;
    
    public PacienteController() {
        sf = NewHibernateUtil.getSessionFactory();
        session = sf.openSession();
    }
    
    @Override
    public Paciente getObjeto(Serializable id) {
        return (Paciente) session.get(Paciente.class, id);
    }
    
    @Override
    public void saveObjeto(Paciente obj) {
        Transaction tx = session.beginTransaction();
        if (obj.getIdPaciente() != 0) {
            session.merge(obj);
        } else {
            session.saveOrUpdate(obj);
        }
        tx.commit();
    }
    
    @Override
    public void deleteObjeto(Serializable id) {
        Transaction tx = session.beginTransaction();
        session.delete(session.get(Paciente.class, id));
        tx.commit();;
    }
    
    @Override
    public List<Paciente> getAll() {
        return session.createQuery("from Paciente").list();
    }
    
}
