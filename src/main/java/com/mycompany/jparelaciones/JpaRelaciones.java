
package com.mycompany.jparelaciones;

import com.mycompany.jparelaciones.logica.Alumno;
import com.mycompany.jparelaciones.logica.ControladoraLogica;
import java.util.ArrayList;
import java.util.Date;

public class JpaRelaciones {

    public static void main(String[] args) {
        
        //Llamamos a la controladoraLogica que va a llamar a
        //la de Persistencia de capa en capa
        ControladoraLogica control = new ControladoraLogica();
        
        /*===DECLARACION PARA CREAR ALUMNO===*/
        /*Creamos un alumno que ira a la base de datos*/
        Alumno alu = new Alumno(7, "Rei", "Thomas", new Date());//va a agregar la fecha de hoy
        /*llamamos al metodo para que cree el alumno*/
        control.crearAlumno(alu);
        /*===================================*/
        
        
        /*===ELIMINAR ALUMNO===*/
        //control.eliminarAlumno(12);
        /*=======================*/
        
        
        /*===MODIFICAR ALUMNO SIN BUSCAR, SINO EL QUE AGREGO RECIEN!===*/
        //alu.setApellido("de Paula");
        //control.editarAlumno(alu);
        /*=======================*/
        
        
        /*===TRAER UN ALUMNO===
        Alumno aluu = control.traerAlumno(17);
        //Mostramos el alumno por pantalla para ver si nos trajo correctamente
        /*Integramas toString si o si para ver los atributos que se 
            encuentran en la base de datos.
        System.out.println("\n=====UN ALUMNO EN PARTICULAR=====");
        System.out.println("El alumno es: " + aluu.toString());
        /*=======================*/
        
        
        /*===TRAER TODA LA LISTA DE ALUMNOS===
        System.out.println("\n=====Lista COMPLETA DE ALUMNOS!=====");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno al : listaAlumnos){
        System.out.println("El alumno es: " + al.toString());
        }
        System.out.println("\n");
        /*=======================*/
        
        
        
    }
}
