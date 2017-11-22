package com.fatec.museu.dao;

import com.fatec.museu.model.Acervo;
import java.util.List;
import javax.persistence.EntityManager;

public class AcervoDAO extends DAO<Acervo> {

    @Override
    public void salvar(Acervo objeto) {
        EntityManager em = super.getEntityManager();
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public List<Acervo> listarTodos() {
        EntityManager em = super.getEntityManager();
        List<Acervo> acervos = em.createQuery("from Acervo").getResultList();
        em.close();
        return acervos;
    }

    @Override
    public void excluir(Acervo objeto) {
        EntityManager em = super.getEntityManager();
        em.getTransaction().begin();
        
        objeto = em.merge(objeto);
        em.remove(objeto);
        em.getTransaction().commit();
        
        em.close();
    }

    @Override
    public Acervo buscar(Acervo objeto) {
        EntityManager em = super.getEntityManager();
        Acervo acervo = em.find(Acervo.class, objeto.getIdAcervo());
        return acervo;
    }
    
}
