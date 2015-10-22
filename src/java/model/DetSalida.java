package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DetSalida generated by hbm2java
 */
@Entity
@Table(name="det_salida"
    ,schema="public"
)
public class DetSalida  implements java.io.Serializable {


     private int idDet;
     private Integer cantidad;
     private Integer idSalida;
     private Integer idInsumo;

    public DetSalida() {
    }

	
    public DetSalida(int idDet) {
        this.idDet = idDet;
    }
    public DetSalida(int idDet, Integer cantidad, Integer idSalida, Integer idInsumo) {
       this.idDet = idDet;
       this.cantidad = cantidad;
       this.idSalida = idSalida;
       this.idInsumo = idInsumo;
    }
   
     @Id 

    
    @Column(name="id_det", unique=true, nullable=false)
    public int getIdDet() {
        return this.idDet;
    }
    
    public void setIdDet(int idDet) {
        this.idDet = idDet;
    }

    
    @Column(name="cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
    @Column(name="id_salida")
    public Integer getIdSalida() {
        return this.idSalida;
    }
    
    public void setIdSalida(Integer idSalida) {
        this.idSalida = idSalida;
    }

    
    @Column(name="id_insumo")
    public Integer getIdInsumo() {
        return this.idInsumo;
    }
    
    public void setIdInsumo(Integer idInsumo) {
        this.idInsumo = idInsumo;
    }




}


