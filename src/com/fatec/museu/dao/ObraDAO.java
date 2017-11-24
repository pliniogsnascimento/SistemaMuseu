package com.fatec.museu.dao;

import com.fatec.museu.model.Acervo;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.model.Obra;
import java.util.List;
import javax.persistence.EntityManager;

public class ObraDAO extends DAO<Obra> {
    
    @Override
    public void salvar(Obra objeto) {
        EntityManager em = super.getEntityManager();
        em.getTransaction().begin();
        em.merge(objeto);
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
    
    
    
}
