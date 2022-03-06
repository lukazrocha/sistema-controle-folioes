package io.programe.modelo;

import io.programe.enums.Setor;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author lukaz
 */
@Entity
public class Ingresso implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_ingresso", sequenceName = "seq_ingresso", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Evento evento;
    @Enumerated(EnumType.STRING)
    private Setor setor;
    private Double valor;

    public Ingresso() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.evento);
        hash = 41 * hash + Objects.hashCode(this.setor);
        hash = 41 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ingresso other = (Ingresso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.evento, other.evento)) {
            return false;
        }
        if (this.setor != other.setor) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ingresso{" + "id=" + id + ", evento=" + evento + ", setor=" + setor + ", valor=" + valor + '}';
    }
    

}
