package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Restauracao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryRestauracaoDAO;

public class TesteRestauracaoDAO {
    
    private DAO dao;
    private Restauracao restauracao;
    
    public TesteRestauracaoDAO() {
        FactoryDAO factory = new FactoryRestauracaoDAO();
        dao = factory.criarDao();
        restauracao = new Restauracao();
    }
    
    public void testeSalvar() {
        
    }
    
    public void testeListar() {
        
    }
    
    public void testeBuscar() {
        
    }
    
    public void testeExcluir() {
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
