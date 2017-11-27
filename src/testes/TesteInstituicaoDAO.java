package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Instituicao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryInstituicaoDAO;
import java.util.List;

public class TesteInstituicaoDAO {
    
    private Instituicao instituicao;
    private DAO dao;
    
    public TesteInstituicaoDAO() {
        FactoryDAO factoryDAO = new FactoryInstituicaoDAO();
        dao = factoryDAO.criarDao();
        instituicao = new Instituicao();
    }
    
    public void testeSalvar() {
        instituicao.setNome("MASP");
        instituicao.setEndereco("Av. Paulista");
        instituicao.setTelefone("(11) 4002-8922");
        
        dao.salvar(instituicao);
    }
    
    public void testeListar() {
        List<Instituicao> instituicoes = dao.listarTodos();
        
        for(Instituicao inst:instituicoes) {
            System.out.println(inst);
        }
    }
    
    public void testeBuscar() {
        instituicao.setIdInstituicao(1L);
        System.out.println(dao.buscar(instituicao));
    }
    
    public void testeExcluir() {
        instituicao.setIdInstituicao(1L);
        dao.excluir(instituicao);
    }
    
    public static void main(String[] args) {
        TesteInstituicaoDAO teste = new TesteInstituicaoDAO();
        //teste.testeSalvar();
        //teste.testeListar();
        //teste.testeBuscar();
        //teste.testeExcluir();
    }
    
}
