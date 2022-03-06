package io.programe.manager;

import io.programe.enums.Setor;
import io.programe.modelo.Endereco;
import io.programe.modelo.Foliao;
import io.programe.modelo.Ingresso;
import io.programe.servico.FoliaoServico;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.*;

/**
 *
 * @author lukaz
 */
@ManagedBean
@ViewScoped
public class FoliaoManagerBean implements Serializable {

    Foliao foliao;
    List<Foliao> folioes;
    private int idFoliao;
    
    private Ingresso ingresso;
    private List<Ingresso> ingressos = new ArrayList<>();
    private Double valorIngresso;
    
    @EJB
    FoliaoServico foliaoServico;

    @PostConstruct
    public void iniciar() {
        foliao = new Foliao();
        foliao.setEndereco(new Endereco());
        foliao.setIngressos(ingressos);
        folioes = new ArrayList<>();
        ingresso = new Ingresso();
        ingresso.setSetor(Setor.CAMAROTE);
    }
    
    public void compraIngresso() {
        ingressos.add(this.ingresso);
        this.foliao.setIngressos(ingressos);
        this.atualizar();
        this.iniciar();
    }
    
        public void alteraValor(){
        switch (ingresso.getSetor()) {
            case PISTA:
                this.valorIngresso = ingresso.getSetor().PISTA.getValor();
                break;
            case FRONT:
                this.valorIngresso = ingresso.getSetor().FRONT.getValor();
                break;
            default:
                this.valorIngresso = ingresso.getSetor().CAMAROTE.getValor();
                break;
        }
        ingresso.setValor(valorIngresso);
    }
    
    
    public Foliao pegarPorIdQuery(){
        System.out.println("ID: " + this.idFoliao);
        Foliao objeto = foliaoServico.getEntityManager()
                .createQuery("select e from Foliao e where e.id = " + this.idFoliao, Foliao.class).getSingleResult();
        this.foliao = objeto;
        return this.foliao;
    }
    
    public Foliao pegarPorId(Long id){
        Foliao objeto = foliaoServico.getEntityManager()
                .find(Foliao.class, id);
        foliaoServico.getEntityManager().refresh(objeto);
        this.foliao = objeto;
        return this.foliao;
    }

    public void salvar() {
        foliaoServico.salvar(foliao);
        foliao = new Foliao();
        foliao.setEndereco(new Endereco());
    }

    public void atualizar() {
        foliaoServico.atualizar(foliao);
    }

    public Foliao buscarPorId(int id) {
       this.foliao = foliaoServico.pegarId(id);
       return this.foliao;
    }

    public List<Foliao> listarTodosAtivos() {
        return foliaoServico.listarTodosAtivos();
    }

    public Foliao getFoliao() {
        return foliao;
    }

    public void setFoliao(Foliao foliao) {
        this.foliao = foliao;
    }

    public List<Foliao> getFolioes() {
        return folioes;
    }

    public void setFolioes(List<Foliao> folioes) {
        this.folioes = folioes;
    }

    public int getIdFoliao() {
        return idFoliao;
    }

    public void setIdFoliao(int idFoliao) {
        this.idFoliao = idFoliao;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    
    
    

}
