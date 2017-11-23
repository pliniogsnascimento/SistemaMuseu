/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.dao;

import com.fatec.museu.model.Sala;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author junig
 */
public class SalaDAO extends DAO<Sala> {

    @Override
    public void salvar(Sala objeto) {
        EntityManager em = super.getEntityManager();
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public List<Sala> listarTodos() {
        EntityManager em = super.getEntityManager();
        
        List<Sala> salas = em.createQuery("from Sala").getResultList();
        em.close();
        return salas;
    }

    @Override
    public void excluir(Sala objeto) {
        EntityManager em = super.getEntityManager();
        objeto = em.find(Sala.class, objeto.getNumeroSala());
        
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public Sala buscar(Sala objeto) {
        EntityManager em = super.getEntityManager();
        objeto = em.find(Sala.class, objeto.getNumeroSala());
        em.close();
        
        return objeto;
    }

   
    
}
