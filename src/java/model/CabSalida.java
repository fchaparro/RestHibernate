package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CabSalida generated by hbm2java
 */
@Entity
@Table(name="cab_salida"
    ,schema="public"
)
public class CabSalida  implements java.io.Serializable {


     private int idSalida;
     private String fecha;
     private String hora;
     private Integer idPersonal;
     private Integer idGrupoAps;
     private Integer idRegistroconsulta;

    public CabSalida() {
    }

	
    public CabSalida(int idSalida) {
        this.idSalida = idSalida;
    }
    public CabSalida(int idSalida, String fecha, String hora, Integer idPersonal, Integer idGrupoAps, Integer idRegistroconsulta) {
       this.idSalida = idSalida;
       this.fecha = fecha;
       this.hora = hora;
       this.idPersonal = idPersonal;
       this.idGrupoAps = idGrupoAps;
       this.idRegistroconsulta = idRegistroconsulta;
    }
   
     @Id 

    
    @Column(name="id_salida", unique=true, nullable=false)
    public int getIdSalida() {
        return this.idSalida;
    }
    
    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    
    @Column(name="fecha")
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="hora")
    public String getHora() {
        return this.hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }

    
    @Column(name="id_personal")
    public Integer getIdPersonal() {
        return this.idPersonal;
    }
    
    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    
    @Column(name="id_grupo_aps")
    public Integer getIdGrupoAps() {
        return this.idGrupoAps;
    }
    
    public void setIdGrupoAps(Integer idGrupoAps) {
        this.idGrupoAps = idGrupoAps;
    }

    
    @Column(name="id_registroconsulta")
    public Integer getIdRegistroconsulta() {
        return this.idRegistroconsulta;
    }
    
    public void setIdRegistroconsulta(Integer idRegistroconsulta) {
        this.idRegistroconsulta = idRegistroconsulta;
    }




}

