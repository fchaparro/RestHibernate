package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cuestionario generated by hbm2java
 */
@Entity
@Table(name="cuestionario"
    ,schema="public"
)
public class Cuestionario  implements java.io.Serializable {


     private int idPregunta;
     private String pregunta;
     private String puntuacion;

    public Cuestionario() {
    }

	
    public Cuestionario(int idPregunta) {
        this.idPregunta = idPregunta;
    }
    public Cuestionario(int idPregunta, String pregunta, String puntuacion) {
       this.idPregunta = idPregunta;
       this.pregunta = pregunta;
       this.puntuacion = puntuacion;
    }
   
     @Id 

    
    @Column(name="id_pregunta", unique=true, nullable=false)
    public int getIdPregunta() {
        return this.idPregunta;
    }
    
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    
    @Column(name="pregunta")
    public String getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    
    @Column(name="puntuacion", length=10)
    public String getPuntuacion() {
        return this.puntuacion;
    }
    
    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }




}


