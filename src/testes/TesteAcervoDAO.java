package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Acervo;
import com.fatec.museu.util.FactoryAcervoDAO;
import com.fatec.museu.util.FactoryDAO;
import java.util.List;

public class TesteAcervoDAO {
    
    public static FactoryDAO factoryDao;
    
    public void testeSalvar() {
        factoryDao = new FactoryAcervoDAO();
        DAO dao = factoryDao.criarDao();
        
        
        Acervo acervo = new Acervo();
        acervo.setDescricao("Este acervo contém obras do tarsila bilau");
        acervo.setOrigemDoAcervo("Virtual");
        
        dao.salvar(acervo);
        
    }
    
    public void testeListarTodos() {
        factoryDao = new FactoryAcervoDAO();
        DAO dao = factoryDao.criarDao();
        
        List<Acervo> acervos = dao.listarTodos();
        for(Acervo acervo:acervos) {
            System.out.println(acervo.toString());
        }
    }
    
    public void testarExcluir() {
        factoryDao = new FactoryAcervoDAO();
        DAO dao = factoryDao.criarDao();
        
        Acervo acervo = new Acervo();
        
        acervo.setIdAcervo(2L);
        
        dao.excluir(acervo);
    }
    
    public void testeBuscar() {
        factoryDao = new FactoryAcervoDAO();
        DAO dao = factoryDao.criarDao();
        
        
        Acervo acervo = new Acervo();
        acervo.setIdAcervo(5L);
        
        acervo = (Acervo) dao.buscar(acervo);
        
        System.out.println(acervo.toString());
        
    }
    
    public static void main(String[] args) {
        TesteAcervoDAO teste = new TesteAcervoDAO();
        //teste.testeSalvar();
        //teste.testeListarTodos();
        teste.testeBuscar();
        //teste.testarExcluir();
    }
}
