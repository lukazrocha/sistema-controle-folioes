package io.programe.modelo;

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
public class Foliao implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_foliao", sequenceName = "seq_foliao", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingresso> ingressos;
    private boolean ativo = true;

    public Foliao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.ingressos);
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
        final Foliao other = (Foliao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.ingressos, other.ingressos)) {
            return false;
        }
        return true;
    }

}
