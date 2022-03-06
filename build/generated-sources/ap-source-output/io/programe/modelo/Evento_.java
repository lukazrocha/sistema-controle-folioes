package io.programe.modelo;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-06T01:00:19")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, Date> dataEvento;
    public static volatile SingularAttribute<Evento, String> nome;
    public static volatile SingularAttribute<Evento, Long> id;
    public static volatile SingularAttribute<Evento, String> descricao;
    public static volatile SingularAttribute<Evento, List> setores;

}