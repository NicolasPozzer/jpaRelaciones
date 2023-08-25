
package com.mycompany.jparelaciones.persistence;

//Controladora de todas nuestras persistencias

import com.mycompany.jparelaciones.logica.Alumno;
import com.mycompany.jparelaciones.logica.Carrera;
import com.mycompany.jparelaciones.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladoraPersistencia {
    
    //Declaramos Todas las unidades de persistencia que tenemos
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    
    
    
    /*===INDICAMOS LO QUE VA A HACER CADA METODO===*/
    
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.out.println("NO EXISTE ESA ID PARA ELIMINAR");
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            System.out.println("NO EXISTE ESTA ID DE ALUMNO PARA EDITAR");
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        //este va con return ya que necesito que devuelva la id
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        //findEntities para traer la lista completa!
        
        //crear lista para recibir los arraylist
        List<Alumno> listita = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listita);
        
        
        return listaAlumnos;
    }

    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }
    
    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.out.println("NO EXISTE ESA ID PARA ELIMINAR");
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        //Siempre es recomendable crear una lista
        //para poder retornar toda la lista
        List<Carrera> carrerita = carreJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>(carrerita);
        
        return listaCarreras;
    }

    

    
    
}
