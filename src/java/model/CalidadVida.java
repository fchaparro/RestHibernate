package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CalidadVida generated by hbm2java
 */
@Entity
@Table(name="calidad_vida"
    ,schema="public"
)
public class CalidadVida  implements java.io.Serializable {


     private int idCalidadvida;
     private String vivienda;
     private String salud;
     private String educacion;
     private Integer idPregunta;
     private Integer idPaciente;

    public CalidadVida() {
    }

	
    public CalidadVida(int idCalidadvida) {
        this.idCalidadvida = idCalidadvida;
    }
    public CalidadVida(int idCalidadvida, String vivienda, String salud, String educacion, Integer idPregunta, Integer idPaciente) {
       this.idCalidadvida = idCalidadvida;
       this.vivienda = vivienda;
       this.salud = salud;
       this.educacion = educacion;
       this.idPregunta = idPregunta;
       this.idPaciente = idPaciente;
    }
   
     @Id 

    
    @Column(name="id_calidadvida", unique=true, nullable=false)
    public int getIdCalidadvida() {
        return this.idCalidadvida;
    }
    
    public void setIdCalidadvida(int idCalidadvida) {
        this.idCalidadvida = idCalidadvida;
    }

    
    @Column(name="vivienda")
    public String getVivienda() {
        return this.vivienda;
    }
    
    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    
    @Column(name="salud")
    public String getSalud() {
        return this.salud;
    }
    
    public void setSalud(String salud) {
        this.salud = salud;
    }

    
    @Column(name="educacion")
    public String getEducacion() {
        return this.educacion;
    }
    
    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    
    @Column(name="id_pregunta")
    public Integer getIdPregunta() {
        return this.idPregunta;
    }
    
    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    
    @Column(name="id_paciente")
    public Integer getIdPaciente() {
        return this.idPaciente;
    }
    
    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }




}


