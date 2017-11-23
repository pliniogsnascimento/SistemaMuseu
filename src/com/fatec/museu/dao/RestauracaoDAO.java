package com.fatec.museu.dao;

import com.fatec.museu.model.Restauracao;
import java.util.List;
import javax.persistence.EntityManager;

public class RestauracaoDAO extends DAO<Restauracao> {

    @Override
    public void salvar(Restauracao objeto) {
        EntityManager em = super.getEntityManager();
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public List<Restauracao> listarTodos() {
        EntityManager em = super.getEntityManager();
        
        List<Restauracao> restauracoes = em.createQuery("from Restauracao").getResultList();
        em.close();
        return restauracoes;
    }

    @Override
    public void excluir(Restauracao objeto) {
        EntityManager em = super.getEntityManager();
        
        objeto = em.find(Restauracao.class, objeto.getIdRestauracao());
        
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public Restauracao buscar(Restauracao objeto) {
        EntityManager em = super.getEntityManager();
        
        objeto = em.find(Restauracao.class, objeto.getIdRestauracao());
        em.close();
        return objeto;
    }
    
}
