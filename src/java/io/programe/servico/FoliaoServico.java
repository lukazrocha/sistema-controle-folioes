package io.programe.servico;

import io.programe.generico.ServicoGenerico;
import io.programe.modelo.Foliao;
import javax.ejb.Stateless;

/**
 *
 * @author lukaz
 */
@Stateless
public class FoliaoServico extends ServicoGenerico<Foliao> {

    public FoliaoServico() {
        super(Foliao.class);
    }
        
}
