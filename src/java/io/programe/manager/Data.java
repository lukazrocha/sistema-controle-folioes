/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.programe.manager;

import io.programe.enums.*;
import io.programe.modelo.Evento;
import io.programe.servico.EventoServico;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.faces.bean.*;
import javax.faces.model.SelectItem;

/**
 *
 * @author lukaz
 */
@ManagedBean
@ViewScoped
public class Data implements Serializable {

    @EJB
    EventoServico eventoServico;
    List<Evento> eventos;
    
    public List<SelectItem> getTipoLogradouros() {
        List<SelectItem> items = new ArrayList();
        for (TipoLogradouro tLog : TipoLogradouro.values()) {
            items.add(new SelectItem(tLog, tLog.name()));
        }
        return items;
    }

    public List<SelectItem> getSetoresEvento() {
        List<SelectItem> items = new ArrayList();
        for (Setor s : Setor.values()) {
            items.add(new SelectItem(s, s.name()));
        }
        return items;
    }
    
    public List<Evento> getEventosAbertos(){
        eventos = eventoServico.findAll();
        return eventos;
    }
    
//    pubic List<> listaGeral(){
//        
//    }

}
