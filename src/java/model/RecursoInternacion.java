package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RecursoInternacion generated by hbm2java
 */
@Entity
@Table(name="recurso_internacion"
    ,schema="public"
)
public class RecursoInternacion  implements java.io.Serializable {


     private int idRecursoInternacion;
     private Integer cantidadRecursoInternacion;
     private String tipoRecurso;

    public RecursoInternacion() {
    }

	
    public RecursoInternacion(int idRecursoInternacion, String tipoRecurso) {
        this.idRecursoInternacion = idRecursoInternacion;
        this.tipoRecurso = tipoRecurso;
    }
    public RecursoInternacion(int idRecursoInternacion, Integer cantidadRecursoInternacion, String tipoRecurso) {
       this.idRecursoInternacion = idRecursoInternacion;
       this.cantidadRecursoInternacion = cantidadRecursoInternacion;
       this.tipoRecurso = tipoRecurso;
    }
   
     @Id 

    
    @Column(name="id_recurso_internacion", unique=true, nullable=false)
    public int getIdRecursoInternacion() {
        return this.idRecursoInternacion;
    }
    
    public void setIdRecursoInternacion(int idRecursoInternacion) {
        this.idRecursoInternacion = idRecursoInternacion;
    }

    
    @Column(name="cantidad_recurso_internacion")
    public Integer getCantidadRecursoInternacion() {
        return this.cantidadRecursoInternacion;
    }
    
    public void setCantidadRecursoInternacion(Integer cantidadRecursoInternacion) {
        this.cantidadRecursoInternacion = cantidadRecursoInternacion;
    }

    
    @Column(name="tipo_recurso", nullable=false, length=25)
    public String getTipoRecurso() {
        return this.tipoRecurso;
    }
    
    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }




}


