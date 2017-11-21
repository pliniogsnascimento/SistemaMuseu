package com.fatec.museu.dao;

import com.fatec.museu.model.Gerente;
import java.util.List;
import javax.persistence.EntityManager;

public class GerenteDAO extends DAO<Gerente>{

    @Override
    public void salvar(Gerente objeto) {
        EntityManager em = super.getEntityManager();
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public List<Gerente> listarTodos() {
        EntityManager em = super.getEntityManager();
        
        List<Gerente> gerentes = em.createQuery("from Gerente").getResultList();
        em.close();
        
        return gerentes;
    }

    @Override
    public void excluir(Gerente objeto) {
        EntityManager em = super.getEntityManager();
        
        em.getTransaction().begin();
        objeto = em.merge(objeto);
        
        if(objeto != null) {
            em.remove(objeto);
            em.getTransaction().commit();
        }
        else {
            System.out.println("Objeto não encontrado");
        }
        em.close();
    }

    @Override
    public Gerente buscar(Gerente objeto) {
        EntityManager em = super.getEntityManager();
        
        Gerente gerente = em.find(Gerente.class, objeto.getIdGerente());
        em.close();
        return gerente;
    }
    
}
