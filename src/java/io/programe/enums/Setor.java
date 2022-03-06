
package io.programe.enums;

/**
 *
 * @author lukaz
 */
public enum Setor {
    
    CAMAROTE(200.00), FRONT(180.00), PISTA(150.00);
    
    private Double valor;
    
    Setor(Double valor){
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}
