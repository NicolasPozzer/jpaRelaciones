
package com.mycompany.jparelaciones.logica;

import com.mycompany.jparelaciones.persistence.ControladoraPersistencia;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //Mapeamos la Entidad.
public class Alumno implements Serializable {
    
    @Id //Mapeamos PrimaryKey autogenerado.
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic //Mapeamos atributos basicos.
    private String nombre;
    private String apellido;
    
    @Temporal(TemporalType.DATE)//Mapeamos fecha de nacimiento.
    private Date fechaNac;
    
    //Relacion 1 a 1 de un alumno a carrera
    @OneToOne
    private Carrera carre;
    
    
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac, Carrera carre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.carre = carre;
    }

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + '}';
    }
    
    
    
}
