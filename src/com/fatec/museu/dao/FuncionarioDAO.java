package com.fatec.museu.dao;

import com.fatec.museu.model.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;

public class FuncionarioDAO extends DAO<Funcionario> {
    
    @Override
    public void salvar(Funcionario objeto) {
        EntityManager em = super.getEntityManager();
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        
        em.close();
    }
    
    @Override
    public List<Funcionario> listarTodos() {
        EntityManager em = super.getEntityManager();
        
        List<Funcionario> funcionarios = em.createQuery("from Funcionario", Funcionario.class).getResultList();
        
        em.close();
        
        return funcionarios;
    }
    
    @Override
    public void excluir(Funcionario objeto) {
        EntityManager em = super.getEntityManager();
        
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
        EntityManager em = super.getEntityManager();
        
        Funcionario retorno = (Funcionario) em.find(Funcionario.class, objeto.getCpf());
        
        em.close();
        return retorno;
    }
    
}
