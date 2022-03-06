package io.programe.servico;

import io.programe.generico.ServicoGenerico;
import io.programe.modelo.Evento;
import javax.ejb.Stateless;

/**
 *
 * @author lukaz
 */
@Stateless
public class EventoServico extends ServicoGenerico<Evento> {

    public EventoServico() {
        super(Evento.class);
    }

}
