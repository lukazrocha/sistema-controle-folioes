
package io.programe.generico;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author lukaz
 * @param <T>
 */
public class ServicoGenerico<T> {

    @PersistenceContext
    EntityManager em;
    
    private final Class<T> entity;

    
    public ServicoGenerico(Class<T> entity) {
        this.entity = entity;
    }

    public void salvar(T entity) {
        em.persist(entity);
    }

    public void atualizar(T entity) {
        em.merge(entity);
        em.flush();
    }

    public T pegarPorId(Long entityID) {
        T objeto = getEntityManager().find(entity, entityID);
        getEntityManager().refresh(objeto);
        return objeto;
    }
    
    public T pegarId(int id){
        return (T) em.createQuery("select e from " + entity.getSimpleName() + " e where e.id=" +id).getSingleResult();
               
    }
    
    public List<T> findAll() {
        return em.createQuery("select e from " + entity.getSimpleName() + " e ").getResultList();

    }

    public List<T> listarTodosAtivos() {
        return em.createQuery("select e from " + entity.getSimpleName() + " e where ativo=true ").getResultList();

    }
    
    public List<T> buscarCPF(String cpf) {
        return em.createQuery("select e from " + entity.getSimpleName() + " e where e.CPF = "+ cpf).getResultList();
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.em = entityManager;
    }

}