package io.programe.converters;

import io.programe.modelo.Evento;
import io.programe.servico.EventoServico;
import java.io.Serializable;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author lukaz
 */
@FacesConverter(forClass = Evento.class, value = "eventoConverter")
public class EventoConverter implements Converter, Serializable{

    @EJB
    EventoServico eventoServico;
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent component, String value) {
        if (value != null){
            return getMapaObjetos(component).get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent component, Object value) {
        if (value != null ){
            Evento evento = (Evento) value;
            adicionarAtributo(component, evento);
            String chave = String.valueOf(evento.getId());
            return chave;
           
        }
        return (String) value;
    }
    
    protected Map<String, Object> getMapaObjetos(UIComponent component){
        return component.getAttributes();
    }
    
    protected void adicionarAtributo(UIComponent component, Evento evento){
        String chave = String.valueOf(evento.getId());
        getMapaObjetos(component).put(chave, evento);
    }
    
}
