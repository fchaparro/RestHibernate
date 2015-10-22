/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.PaisesController;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import model.Paises;

/**
 *
 * @author Fredy
 */
@Stateless
@Path("model.paises")
public class PaisesFacadeREST  {
    
    PaisesController ec;
    
    public PaisesFacadeREST() {
       ec = new PaisesController();
    }

    @POST
  
    @Consumes({"application/xml", "application/json"})
    public void create(Paises entity) {
       System.err.println("Guardando");
        ec.saveObjeto(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Paises entity) {
        ec.saveObjeto(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
       ec.deleteObjeto(id);
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Paises find(@PathParam("id") Integer id) {
      //  return super.find(id);
       return ec.getObjeto(id);
    }

    @GET
 //   @Override
    @Produces({"application/xml", "application/json"})
    public List<Paises> findAll() {
        //return super.findAll();
       return  ec.getAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Paises> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
       // return super.findRange(new int[]{from, to});
        return null;
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
       // return String.valueOf(super.count());
        return null;
    }

   
    
}
