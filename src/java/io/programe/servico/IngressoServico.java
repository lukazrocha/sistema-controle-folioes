package io.programe.servico;

import io.programe.generico.ServicoGenerico;
import io.programe.modelo.Ingresso;
import javax.ejb.Stateless;

/**
 *
 * @author lukaz
 */
@Stateless
public class IngressoServico extends ServicoGenerico<Ingresso> {

    public IngressoServico() {
        super(Ingresso.class);
    }
}
