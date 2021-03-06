package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Proveedor generated by hbm2java
 */
@Entity
@Table(name="proveedor"
    ,schema="public"
)
public class Proveedor  implements java.io.Serializable {


     private int idProveedor;
     private String nombreProveedor;
     private String direccionProveedor;
     private Integer telefonoProveedor;
     private String emailProveedor;

    public Proveedor() {
    }

	
    public Proveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public Proveedor(int idProveedor, String nombreProveedor, String direccionProveedor, Integer telefonoProveedor, String emailProveedor) {
       this.idProveedor = idProveedor;
       this.nombreProveedor = nombreProveedor;
       this.direccionProveedor = direccionProveedor;
       this.telefonoProveedor = telefonoProveedor;
       this.emailProveedor = emailProveedor;
    }
   
     @Id 

    
    @Column(name="id_proveedor", unique=true, nullable=false)
    public int getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    
    @Column(name="nombre_proveedor")
    public String getNombreProveedor() {
        return this.nombreProveedor;
    }
    
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    
    @Column(name="direccion_proveedor")
    public String getDireccionProveedor() {
        return this.direccionProveedor;
    }
    
    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    
    @Column(name="telefono_proveedor")
    public Integer getTelefonoProveedor() {
        return this.telefonoProveedor;
    }
    
    public void setTelefonoProveedor(Integer telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    
    @Column(name="email_proveedor")
    public String getEmailProveedor() {
        return this.emailProveedor;
    }
    
    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }




}


