package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PromocionSalud generated by hbm2java
 */
@Entity
@Table(name="promocion_salud"
    ,schema="public"
)
public class PromocionSalud  implements java.io.Serializable {


     private int idPromocion;
     private String horaInicio;
     private String fechaPromocion;
     private String lugarPromocion;
     private String temaPromocion;
     private String duracionPromocion;
     private Integer idCentro;

    public PromocionSalud() {
    }

	
    public PromocionSalud(int idPromocion) {
        this.idPromocion = idPromocion;
    }
    public PromocionSalud(int idPromocion, String horaInicio, String fechaPromocion, String lugarPromocion, String temaPromocion, String duracionPromocion, Integer idCentro) {
       this.idPromocion = idPromocion;
       this.horaInicio = horaInicio;
       this.fechaPromocion = fechaPromocion;
       this.lugarPromocion = lugarPromocion;
       this.temaPromocion = temaPromocion;
       this.duracionPromocion = duracionPromocion;
       this.idCentro = idCentro;
    }
   
     @Id 

    
    @Column(name="id_promocion", unique=true, nullable=false)
    public int getIdPromocion() {
        return this.idPromocion;
    }
    
    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    
    @Column(name="hora_inicio")
    public String getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    
    @Column(name="fecha_promocion")
    public String getFechaPromocion() {
        return this.fechaPromocion;
    }
    
    public void setFechaPromocion(String fechaPromocion) {
        this.fechaPromocion = fechaPromocion;
    }

    
    @Column(name="lugar_promocion")
    public String getLugarPromocion() {
        return this.lugarPromocion;
    }
    
    public void setLugarPromocion(String lugarPromocion) {
        this.lugarPromocion = lugarPromocion;
    }

    
    @Column(name="tema_promocion")
    public String getTemaPromocion() {
        return this.temaPromocion;
    }
    
    public void setTemaPromocion(String temaPromocion) {
        this.temaPromocion = temaPromocion;
    }

    
    @Column(name="duracion_promocion")
    public String getDuracionPromocion() {
        return this.duracionPromocion;
    }
    
    public void setDuracionPromocion(String duracionPromocion) {
        this.duracionPromocion = duracionPromocion;
    }

    
    @Column(name="id_centro")
    public Integer getIdCentro() {
        return this.idCentro;
    }
    
    public void setIdCentro(Integer idCentro) {
        this.idCentro = idCentro;
    }




}

