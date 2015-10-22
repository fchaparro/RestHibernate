/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Fredy
 */
public interface CRUDInterface<E> {
      
    public E getObjeto(Serializable id);
    public void saveObjeto(E obj);
    public void deleteObjeto(Serializable id);
    public List<E> getAll();

    
}
