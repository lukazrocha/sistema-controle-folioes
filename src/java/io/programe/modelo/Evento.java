package io.programe.modelo;

import io.programe.enums.Setor;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author lukaz
 */
@Entity
public class Evento implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_evento", sequenceName = "seq_evento", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEvento;

    private List<Setor> setores;

    public Evento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public List<Setor> getSetores() {
        return setores;
    }

    public void setSetores(List<Setor> setores) {
        this.setores = setores;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.descricao);
        hash = 29 * hash + Objects.hashCode(this.dataEvento);
        hash = 29 * hash + Objects.hashCode(this.setores);
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataEvento, other.dataEvento)) {
            return false;
        }
        if (!Objects.equals(this.setores, other.setores)) {
            return false;
        }
        return true;
    }

}
