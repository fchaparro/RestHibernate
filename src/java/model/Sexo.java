package model;
// Generated 22/10/2015 03:30:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sexo generated by hbm2java
 */
@Entity
@Table(name="sexo"
    ,schema="public"
)
public class Sexo  implements java.io.Serializable {


     private int idSexo;
     private String sexo;

    public Sexo() {
    }

    public Sexo(int idSexo, String sexo) {
       this.idSexo = idSexo;
       this.sexo = sexo;
    }
   
     @Id 

    
    @Column(name="id_sexo", unique=true, nullable=false)
    public int getIdSexo() {
        return this.idSexo;
    }
    
    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    
    @Column(name="sexo", nullable=false, length=25)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }




}


