
package com.mycompany.jparelaciones.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nombre;
    
    
    
    //Declaramos el 1 a n de carrera y materias
    //Como son varios objetos hacemos con una LinkedList
    //Esto es una relacion 1 a n Unidireccional
    //Ya que el unico que necesitamos informar datos del otro
    //es a Carrera y materia no sabe nada de Carrera, osea no
    //se declara nada de carrera en materia.
    @OneToMany(mappedBy="carre")//para generar la relacion bidireccional y no tener mal la db.
    private LinkedList<Materia> listaMaterias;

    public Carrera() {
    }

    public Carrera(int id, String nombre, LinkedList<Materia> listaMaterias) {
        this.id = id;
        this.nombre = nombre;
        this.listaMaterias = listaMaterias;
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

    public LinkedList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(LinkedList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    
    
    
    
    
}
