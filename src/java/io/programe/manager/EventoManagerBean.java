
package io.programe.manager;

import io.programe.modelo.Evento;
import io.programe.servico.EventoServico;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.*;

/**
 *
 * @author lukaz
 */
@ManagedBean
@ViewScoped
public class EventoManagerBean implements Serializable{
    
    private Evento evento;
    private List<Evento> eventos = new ArrayList<>();
    
    @EJB
    private EventoServico eventoServico;
    
    @PostConstruct
    public void iniciar(){
        evento = new Evento();
        eventos = eventoServico.findAll();
    }
    
    public void salvar(){
        eventoServico.salvar(evento);
        evento = new Evento();
    }
    
    public void atualizar(){
        eventoServico.atualizar(evento);
    }
    
    public Evento buscarPorId(Long id){
        return eventoServico.pegarPorId(id);
    }
    
    public List<Evento> listarTodosAtivos(){
         return eventoServico.listarTodosAtivos();
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
    
    
}
