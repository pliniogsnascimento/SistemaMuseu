package testes;

import com.fatec.museu.model.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteHibernate {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbmuseu");
        EntityManager em = emf.createEntityManager();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("111.111.111-12");
        funcionario.setNome("Josney");
        
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
        
        System.out.println("Gravado com sucesso");
        
        em.close();
    }
    
}
