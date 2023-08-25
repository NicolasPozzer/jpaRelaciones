
package com.mycompany.jparelaciones;

import com.mycompany.jparelaciones.logica.Alumno;
import com.mycompany.jparelaciones.logica.Carrera;
import com.mycompany.jparelaciones.logica.ControladoraLogica;
import com.mycompany.jparelaciones.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class JpaRelaciones {

    public static void main(String[] args) {
        ControladoraLogica control = new ControladoraLogica();
        
        /*===PASOS===*/
        
        //Creamos lista de materias y las agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        //Creacion Carrera con lista de Materias
        Carrera carre = new Carrera(24, "Lic. Sistemas", listaMaterias);//De esta manera asignamos materia a una carrera, Ej. poniendo la lista de materias en una carrera.
        //Guardado Carrera en db
        //Primero guarmamos creamos y guardamos la materia ya que las materias
        //necesita primero una carrera para que no salte NULL.
        control.crearCarrera(carre);
        
        //Creacion Materias
        Materia mate1 = new Materia(58, "Lengua", "Cuatrimestral", carre);
        Materia mate2 = new Materia(33, "Programacion 1", "Bimestral", carre);
        Materia mate3 = new Materia(47, "Ingles", "Anual", carre);
        
        //GuardadoMaterias en db
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregar a la lista las materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        //Agregamos la lista de materias a la carrera con un edit
        carre.setListaMaterias(listaMaterias);
        //Edita la lista en db
        control.editarCarrera(carre);
        
        
        //Creacion de Alumno (con Carrera)
        Alumno alu = new Alumno(1, "Nicolas", "Pozzer", new Date(), carre);
        //Guardamos el Alumno en la db
        control.crearAlumno(alu);
        
        
        
        
        
        /*===DECLARACION PARA CREAR Carreara y asignar a Alumno===*/
        //Llamamos a la controladoraLogica que va a llamar a
        //la de Persistencia de capa en capa
        
        
        /*===DECLARACION PARA CREAR CARRERA===*/
        //Carrera carre = new Carrera(27, "Futbolista");
        //control.crearCarrera(carre);
        /*===================================*/
        
        /*===ASOCIAR CARRERA A ALUMNO Y GUARDAR EN LA db===*/
        //Alumno al = new Alumno(5, "Robert", "Taylor", new Date(),carre);//asigno la carrera
        //control.crearAlumno(al);
        //Mostrar sus atributos
        //System.out.println("========Datos Alumno========");
        //Alumno alu = control.traerAlumno(5);
        //System.out.println("Alumno: "+alu.getNombre()+" "+alu.getApellido());
        //System.out.println("De la carrera: "+ alu.getCarre().getNombre());
        /*===================================*/
        

        
        
        /*===DECLARACION PARA CREAR ALUMNO===*/
        /*Creamos un alumno que ira a la base de datos*/
        //Alumno alu = new Alumno(7, "Nick", "Jhones", new Date(),"Lic. Sistemas");//va a agregar la fecha de hoy
        /*llamamos al metodo para que cree el alumno*/
        //control.crearAlumno(alu);
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
