/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.EnfermedadesController;
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
import model.Enfermedades;

/**
 *
 * @author Fredy
 */
@Stateless
@Path("model.enfermedades")
public class EnfermedadesFacadeREST  {
    
    EnfermedadesController ec;
    
    public EnfermedadesFacadeREST() {
       ec = new EnfermedadesController();
    }

    @POST
  
    @Consumes({"application/xml", "application/json"})
    public void create(Enfermedades entity) {
       System.err.println("Guardando");
        ec.saveObjeto(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Enfermedades entity) {
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
    public Enfermedades find(@PathParam("id") Integer id) {
      //  return super.find(id);
       return ec.getObjeto(id);
    }

    @GET
 //   @Override
    @Produces({"application/xml", "application/json"})
    public List<Enfermedades> findAll() {
        //return super.findAll();
       return  ec.getAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Enfermedades> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
