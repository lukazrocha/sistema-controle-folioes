package io.programe.modelo;

import io.programe.enums.Setor;
import io.programe.modelo.Evento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-06T01:00:19")
@StaticMetamodel(Ingresso.class)
public class Ingresso_ { 

    public static volatile SingularAttribute<Ingresso, Setor> setor;
    public static volatile SingularAttribute<Ingresso, Evento> evento;
    public static volatile SingularAttribute<Ingresso, Double> valor;
    public static volatile SingularAttribute<Ingresso, Long> id;

}