package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Profesion generated by hbm2java
 */
@Entity
@Table(name="profesion"
    ,schema="public"
)
public class Profesion  implements java.io.Serializable {


     private int idProfesion;
     private String infinitivo;
     private String profesion;

    public Profesion() {
    }

	
    public Profesion(int idProfesion, String profesion) {
        this.idProfesion = idProfesion;
        this.profesion = profesion;
    }
    public Profesion(int idProfesion, String infinitivo, String profesion) {
       this.idProfesion = idProfesion;
       this.infinitivo = infinitivo;
       this.profesion = profesion;
    }
   
     @Id 

    
    @Column(name="id_profesion", unique=true, nullable=false)
    public int getIdProfesion() {
        return this.idProfesion;
    }
    
    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    
    @Column(name="infinitivo")
    public String getInfinitivo() {
        return this.infinitivo;
    }
    
    public void setInfinitivo(String infinitivo) {
        this.infinitivo = infinitivo;
    }

    
    @Column(name="profesion", nullable=false, length=25)
    public String getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }




}


