package com.mycompany.jparelaciones.logica;

import com.mycompany.jparelaciones.logica.Materia;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-25T19:44:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile ListAttribute<Carrera, Materia> listaMaterias;
    public static volatile SingularAttribute<Carrera, Integer> id;
    public static volatile SingularAttribute<Carrera, String> nombre;

}