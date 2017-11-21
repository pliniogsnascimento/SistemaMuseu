package com.fatec.museu.dao;

import com.fatec.museu.model.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FuncionarioDAO extends DAO<Funcionario> {
    
    @Override
    public void salvar(Funcionario objeto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DAO.persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        
        em.close();
    }
    
    @Override
    public List<Funcionario> listarTodos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DAO.persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        
        List<Funcionario> funcionarios = em.createQuery("from Funcionario", Funcionario.class).getResultList();
        
        em.close();
        
        return funcionarios;
    }
    
    @Override
    public void excluir(Funcionario objeto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DAO.persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        
        if(objeto != null) {
            em.getTransaction().begin();
            objeto = em.merge(objeto);
            em.remove(objeto);
            em.getTransaction().commit();
            
            System.out.println("Removido");
        }
        
        
        
        em.close();
    }
    
    @Override
    public Funcionario buscar(Funcionario objeto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DAO.persistenceUnitName);
        EntityManager em = emf.createEntityManager();
        
        Funcionario retorno = (Funcionario) em.find(Funcionario.class, objeto.getCpf());
        
        em.close();
        return retorno;
    }
    
}
