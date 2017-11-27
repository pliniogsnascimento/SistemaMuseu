package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.ObraDAO;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryExposicaoDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class TesteExposicaoDAO {
    
    private Exposicao exposicao;
    private DAO dao;
    FactoryDAO factory = new FactoryExposicaoDAO();
    
    public TesteExposicaoDAO() {
        this.exposicao = new Exposicao();
        this.dao = factory.criarDao();
    }
    
    public void testeSalvar() {
        exposicao.setNome("Da Vinci");
        exposicao.setDataInicio(new Date());
        
        dao.salvar(exposicao);
        
        System.out.println("Gravado com sucesso");
    }
    
    public void testeListar() {
        List<Exposicao> exposicoes = dao.listarTodos();
        
        for(Exposicao exp: exposicoes) {
           System.out.println(exp);
        }
    }
    
    public void testeBuscar() {
        exposicao.setIdExposicao(1L);
        exposicao = (Exposicao) dao.buscar(exposicao);
        System.out.println(exposicao);
    }
    
    public void testeExcluir() {
        exposicao.setIdExposicao(9L);
        /*
        ObraDAO obDao = new ObraDAO();
        obDao.desvincularExposicao(exposicao.getIdExposicao());
        */
        dao.excluir(exposicao);
        System.out.println("Exposição excluida com sucesso");
    }
    
    public static void main(String[] args) {
        TesteExposicaoDAO teste = new TesteExposicaoDAO();
        TesteObraDAO teste2 = new TesteObraDAO();
        //teste.testeSalvar();
        //teste.testeListar();
        //teste.testeBuscar();
        //teste2.testeSalvar();
        //teste.testeExcluir();
    }
    
}
