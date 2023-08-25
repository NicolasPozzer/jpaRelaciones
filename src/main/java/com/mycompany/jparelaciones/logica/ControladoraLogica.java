package com.mycompany.jparelaciones.logica;

import com.mycompany.jparelaciones.persistence.ControladoraPersistencia;
import java.util.ArrayList;



public class ControladoraLogica {
    
    /*==============================================
    Esta controladora va contener
    todos los metodos que vamos a necesitar
    para poder llamarlos a nuestra persistencia para
    que interactue con nuestra base de datos
    Ejemplo: si yo quiero crear un metodo "create", 
    esto va a llamar al create de la 
    controladora de persistencia
    ===============================================*/
    
    //Primero conectar con la controladora de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Crear un metodo que se encargue de dar de alta un nuevo
    //Alumno para pasarlo luego a la persistencia
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    
    //Creamos metodo de eliminacion de alumno
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    
    
    //Metodo para editar alumno
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    //Metodo para traer un alumno en particular
    public Alumno traerAlumno(int id){
        //Tiene que retornar valor una vez encuentra el alumno
        return controlPersis.traerAlumno(id);
    }
    
    //Metodo de Lista para traer todos los alumnos
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
    
    
    /*METODOS IGUALES PARA CARRERA*/
    
    //Crear un metodo que se encargue de dar de alta una nueva
    //Carrera para pasarlo luego a la persistencia
    public void crearCarrera(Carrera carre){
        controlPersis.crearCarrera(carre);
    }
    
    
    //Creamos metodo de eliminacion de Carrera
    public void eliminarCarrera(int id){
        controlPersis.eliminarCarrera(id);
    }
    
    //Metodo para editar Carrera
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    
    //Metodo para traer una Carrera en particular
    public Carrera traerCarrera(int id){
        //Tiene que retornar valor una vez encuentra la Carrera
        return controlPersis.traerCarrera(id);
    }
    
    //Metodo de Lista para traer todas los Carreras
    public ArrayList<Carrera> traerListaCarreras(){
        return controlPersis.traerListaCarreras();
    }
    
    
    /*METODOS IGUALES PARA MATERIA*/
    
    //Crear un metodo que se encargue de dar de alta una nueva
    //Carrera para pasarlo luego a la persistencia
    public void crearMateria(Materia mate){
        controlPersis.crearMateria(mate);
    }
    
    
    //Creamos metodo de eliminacion de Carrera
    public void eliminarMateria(int id){
        controlPersis.eliminarMateria(id);
    }
    
    //Metodo para editar Carrera
    public void editarMateria(Materia mate){
        controlPersis.editarMateria(mate);
    }
    
    //Metodo para traer una Carrera en particular
    public Materia traerMateria(int id){
        //Tiene que retornar valor una vez encuentra la Carrera
        return controlPersis.traerMateria(id);
    }
    
    //Metodo de Lista para traer todas los Carreras
    public ArrayList<Materia> traerListaMaterias(){
        return controlPersis.traerListaMaterias();
    }
    
    
}