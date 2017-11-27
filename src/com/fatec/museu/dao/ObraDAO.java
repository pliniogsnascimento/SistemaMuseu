package com.fatec.museu.dao;

import com.fatec.museu.model.Acervo;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.model.Obra;
import com.fatec.museu.util.Desvinculavel;
import java.util.List;
import javax.persistence.EntityManager;

public class ObraDAO extends DAO<Obra> implements Desvinculavel {
    
    @Override
    public void salvar(Obra objeto) {
        EntityManager em = super.getEntityManager();
        
        if(objeto.getExposicao() != null) {
            Exposicao exposicao = em.find(Exposicao.class, objeto.getExposicao().getIdExposicao());
            objeto.setExposicao(exposicao);
        }
        
        em.getTransaction().begin();
        em.merge(objeto);
        em.flush();
        em.getTransaction().commit();
        
        em.close();
    }
    
    @Override
    public List<Obra> listarTodos() {
        EntityManager em = super.getEntityManager();
        List<Obra> obras = em.createQuery("from Obra").getResultList();
        em.close();
        return obras;
    }
    
    @Override
    public void excluir(Obra objeto) {
        EntityManager em = super.getEntityManager();
        objeto = em.find(Obra.class, objeto.getIdObra());
        
        em.getTransaction().begin();
        
        if(objeto.getAcervo() != null || objeto.getExposicao() != null) {
            if(objeto.getAcervo() != null) {
                Acervo acervo = objeto.getAcervo();
                acervo.getObras().remove(objeto);
            }
            
            if(objeto.getExposicao() != null) {
                Exposicao exposicao = objeto.getExposicao();
                exposicao.getObras().remove(objeto);
            }
            
            em.getTransaction().commit();
        }
        else {
            em.remove(objeto);
            em.getTransaction().commit();
        }
        
        em.close();
        
        
    }
    
    @Override
    public Obra buscar(Obra objeto) {
        EntityManager em = super.getEntityManager();
        
        objeto = em.find(Obra.class, objeto.getIdObra());
        
        em.close();
        return objeto;
    }
    
    @Override
    public void desvincularFK(Long id) {
        List<Obra> obras = listarTodos();
        
        for(Obra obra:obras) {
            if(obra.getExposicao()!= null && obra.getExposicao().getIdExposicao().equals(id)) {
                System.out.println(obra);
                obra.setExposicao(null);
                salvar(obra);
            }
        }
    }
    
}
