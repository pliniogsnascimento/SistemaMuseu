package com.fatec.museu.dao;

import com.fatec.museu.model.Gerente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerenteDAO extends DAO<Gerente>{

    @Override
    public void salvar(Gerente objeto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public List<Gerente> listarTodos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        
        List<Gerente> gerentes = em.createQuery("from Gerente").getResultList();
        em.close();
        
        return gerentes;
    }

    @Override
    public void excluir(Gerente objeto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        
        Gerente gerente = em.find(Gerente.class, objeto.getIdGerente());
        em.close();
        return gerente;
    }

    
}
