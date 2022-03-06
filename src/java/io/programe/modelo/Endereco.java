package io.programe.modelo;

import io.programe.enums.TipoLogradouro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.faces.model.SelectItem;
import javax.persistence.*;

/**
 *
 * @author lukaz
 */
@Entity
public class Endereco implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoLogradouro tipoLogradouro;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco() {

    }

    public List<SelectItem> getTipoLogradouros() {
        List<SelectItem> items = new ArrayList();
        for (TipoLogradouro tLog : TipoLogradouro.values()) {
            items.add(new SelectItem(tLog, tLog.name()));
        }

        return items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.tipoLogradouro);
        hash = 89 * hash + Objects.hashCode(this.logradouro);
        hash = 89 * hash + Objects.hashCode(this.numero);
        hash = 89 * hash + Objects.hashCode(this.bairro);
        hash = 89 * hash + Objects.hashCode(this.cidade);
        hash = 89 * hash + Objects.hashCode(this.estado);
        hash = 89 * hash + Objects.hashCode(this.cep);
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.tipoLogradouro, other.tipoLogradouro)) {
            return false;
        }
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

}
