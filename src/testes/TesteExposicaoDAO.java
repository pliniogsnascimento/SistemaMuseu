package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryExposicaoDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class TesteExposicaoDAO {
    
    private Exposicao exposicao;
    private DAO dao;
    
    public TesteExposicaoDAO() {
        FactoryDAO factory = new FactoryExposicaoDAO();
        this.exposicao = new Exposicao();
        this.dao = factory.criarDao();
    }
    
    public void testeSalvar() {
        exposicao.setNome("Especial Pablo Picasso");
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
        exposicao.setIdExposicao(2L);
        exposicao = (Exposicao) dao.buscar(exposicao);
        System.out.println(exposicao);
    }
    
    public void testeExcluir() {
        exposicao.setIdExposicao(8L);
        dao.excluir(exposicao);
        System.out.println("Exposição excluida com sucesso");
    }
    
    public static void main(String[] args) {
        TesteExposicaoDAO teste = new TesteExposicaoDAO();
        teste.testeSalvar();
        //teste.testeListar();
        //teste.testeBuscar();
        //teste.testeExcluir();
    }
    
}
