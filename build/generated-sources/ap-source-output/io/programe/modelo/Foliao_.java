package io.programe.modelo;

import io.programe.modelo.Endereco;
import io.programe.modelo.Ingresso;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-06T01:00:19")
@StaticMetamodel(Foliao.class)
public class Foliao_ { 

    public static volatile SingularAttribute<Foliao, Boolean> ativo;
    public static volatile SingularAttribute<Foliao, Endereco> endereco;
    public static volatile SingularAttribute<Foliao, String> rg;
    public static volatile SingularAttribute<Foliao, String> cpf;
    public static volatile SingularAttribute<Foliao, String> nome;
    public static volatile SingularAttribute<Foliao, Long> id;
    public static volatile ListAttribute<Foliao, Ingresso> ingressos;
    public static volatile SingularAttribute<Foliao, Date> dataNascimento;

}