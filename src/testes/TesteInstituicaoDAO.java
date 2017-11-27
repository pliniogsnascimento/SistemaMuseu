package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Instituicao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryInstituicaoDAO;

public class TesteInstituicaoDAO {
    
    private Instituicao instituicao;
    private DAO dao;
    
    public TesteInstituicaoDAO() {
        FactoryDAO factoryDAO = new FactoryInstituicaoDAO();
        dao = factoryDAO.criarDao();
        instituicao = new Instituicao();
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
