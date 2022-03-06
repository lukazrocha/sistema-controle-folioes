package io.programe.manager;

import io.programe.enums.Setor;
import io.programe.modelo.Ingresso;
import io.programe.servico.IngressoServico;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author lukaz
 */
@ManagedBean
@ViewScoped
public class IngressoManagerBean {
    
    Ingresso ingresso;
    List<Ingresso> ingressos;
    
    
    @EJB
    IngressoServico ingressoServico;
    
    @PostConstruct
    public void iniciar(){
        ingresso = new Ingresso();
        ingresso.setSetor(Setor.CAMAROTE);
    }


    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    
    
}
