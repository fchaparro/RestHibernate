package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DetalleReceta generated by hbm2java
 */
@Entity
@Table(name="detalle_receta"
    ,schema="public"
)
public class DetalleReceta  implements java.io.Serializable {


     private int idDetalleReceta;
     private String descripcion;
     private Integer idReceta;
     private Integer idInsumo;

    public DetalleReceta() {
    }

	
    public DetalleReceta(int idDetalleReceta) {
        this.idDetalleReceta = idDetalleReceta;
    }
    public DetalleReceta(int idDetalleReceta, String descripcion, Integer idReceta, Integer idInsumo) {
       this.idDetalleReceta = idDetalleReceta;
       this.descripcion = descripcion;
       this.idReceta = idReceta;
       this.idInsumo = idInsumo;
    }
   
     @Id 

    
    @Column(name="id_detalle_receta", unique=true, nullable=false)
    public int getIdDetalleReceta() {
        return this.idDetalleReceta;
    }
    
    public void setIdDetalleReceta(int idDetalleReceta) {
        this.idDetalleReceta = idDetalleReceta;
    }

    
    @Column(name="descripcion")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="id_receta")
    public Integer getIdReceta() {
        return this.idReceta;
    }
    
    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }

    
    @Column(name="id_insumo")
    public Integer getIdInsumo() {
        return this.idInsumo;
    }
    
    public void setIdInsumo(Integer idInsumo) {
        this.idInsumo = idInsumo;
    }




}

