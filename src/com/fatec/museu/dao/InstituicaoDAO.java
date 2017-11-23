package com.fatec.museu.dao;

import com.fatec.museu.model.Instituicao;
import java.util.List;
import javax.persistence.EntityManager;

public class InstituicaoDAO extends DAO<Instituicao> {
    
    @Override
    public void salvar(Instituicao objeto) {
        EntityManager em = super.getEntityManager();
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        
        em.close();
    }
    
    @Override
    public List<Instituicao> listarTodos() {
        EntityManager em = super.getEntityManager();
        List<Instituicao> exposicoes = em.createQuery("from Exposicao").getResultList();
        em.close();
        return exposicoes;
    }
    
    @Override
    public void excluir(Instituicao objeto) {
        EntityManager em = super.getEntityManager();
        objeto = em.find(Instituicao.class, objeto.getIdInstituicao());
        
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public Instituicao buscar(Instituicao objeto) {
        EntityManager em = super.getEntityManager();
        
        objeto = em.find(Instituicao.class, objeto.getIdInstituicao());
        em.close();
        return objeto;
    }
    
}
