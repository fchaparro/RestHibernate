package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Laboratorio generated by hbm2java
 */
@Entity
@Table(name="laboratorio"
    ,schema="public"
)
public class Laboratorio  implements java.io.Serializable {


     private int idLaboratorio;
     private String nombreLaboratorio;
     private String direccionLaboratorio;
     private Integer telefonoLaboratorio;
     private String emailLaboratorio;

    public Laboratorio() {
    }

	
    public Laboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
    public Laboratorio(int idLaboratorio, String nombreLaboratorio, String direccionLaboratorio, Integer telefonoLaboratorio, String emailLaboratorio) {
       this.idLaboratorio = idLaboratorio;
       this.nombreLaboratorio = nombreLaboratorio;
       this.direccionLaboratorio = direccionLaboratorio;
       this.telefonoLaboratorio = telefonoLaboratorio;
       this.emailLaboratorio = emailLaboratorio;
    }
   
     @Id 

    
    @Column(name="id_laboratorio", unique=true, nullable=false)
    public int getIdLaboratorio() {
        return this.idLaboratorio;
    }
    
    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    
    @Column(name="nombre_laboratorio")
    public String getNombreLaboratorio() {
        return this.nombreLaboratorio;
    }
    
    public void setNombreLaboratorio(String nombreLaboratorio) {
        this.nombreLaboratorio = nombreLaboratorio;
    }

    
    @Column(name="direccion_laboratorio")
    public String getDireccionLaboratorio() {
        return this.direccionLaboratorio;
    }
    
    public void setDireccionLaboratorio(String direccionLaboratorio) {
        this.direccionLaboratorio = direccionLaboratorio;
    }

    
    @Column(name="telefono_laboratorio")
    public Integer getTelefonoLaboratorio() {
        return this.telefonoLaboratorio;
    }
    
    public void setTelefonoLaboratorio(Integer telefonoLaboratorio) {
        this.telefonoLaboratorio = telefonoLaboratorio;
    }

    
    @Column(name="email_laboratorio")
    public String getEmailLaboratorio() {
        return this.emailLaboratorio;
    }
    
    public void setEmailLaboratorio(String emailLaboratorio) {
        this.emailLaboratorio = emailLaboratorio;
    }




}

