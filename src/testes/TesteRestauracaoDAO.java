package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Instituicao;
import com.fatec.museu.model.Obra;
import com.fatec.museu.model.Restauracao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryRestauracaoDAO;
import java.util.List;

public class TesteRestauracaoDAO {
    
    private DAO dao;
    private Restauracao restauracao;
    
    public TesteRestauracaoDAO() {
        FactoryDAO factory = new FactoryRestauracaoDAO();
        dao = factory.criarDao();
        restauracao = new Restauracao();
    }
    
    public void testeSalvar() {
        Obra obra = new Obra();
        Instituicao instituicao = new Instituicao();
        
        instituicao.setIdInstituicao(1L);
        obra.setIdObra(26L);
        restauracao.setDescricao("Restaurando esta merda");
        
        
        dao.salvar(restauracao);
    }
    
    public void testeListar() {
        List<Restauracao> restauracoes = dao.listarTodos();
        
        for(Restauracao rest:restauracoes) {
            System.out.println(rest);
        }
    }
    
    public void testeBuscar() {
        restauracao.setIdRestauracao(1L);
        restauracao = (Restauracao) dao.buscar(restauracao);
        
        System.out.println(restauracao);
    }
    
    public void testeExcluir() {
        restauracao.setIdRestauracao(1L);
        dao.excluir(restauracao);
    }
    
    public static void main(String[] args) {
        TesteRestauracaoDAO teste = new TesteRestauracaoDAO();
        //teste.testeSalvar();
        //teste.testeBuscar();
        //teste.testeListar();
        //teste.testeExcluir();
    }
    
}
