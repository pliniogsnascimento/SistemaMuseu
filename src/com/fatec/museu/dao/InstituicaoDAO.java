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
        List<Instituicao> instituicoes = em.createQuery("from Instituicao").getResultList();
        em.close();
        return instituicoes;
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

    public Instituicao buscarPorNome(String nome) {
        EntityManager em = super.getEntityManager();
        
        Instituicao instituicao =  (Instituicao) em.createQuery("from Instituicao where nome = ?1").setParameter(1, nome).getSingleResult();
        
        em.close();
        
        return instituicao;
    }
    
}
