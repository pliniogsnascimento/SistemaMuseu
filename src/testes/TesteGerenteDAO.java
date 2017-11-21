package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Funcionario;
import com.fatec.museu.model.Gerente;
import com.fatec.museu.util.FactoryFuncionarioDAO;
import com.fatec.museu.util.FactoryGerenteDAO;
import java.util.Date;
import java.util.List;
import static testes.TesteFuncionarioDAO.factoryDao;

public class TesteGerenteDAO {
    public void testeSalvar() {
        factoryDao = new FactoryGerenteDAO();
        DAO dao = factoryDao.criarDao();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("125.456.789-99");
        funcionario.setNome("Kedley");
        funcionario.setLogin("kedley");
        funcionario.setSenha("123456");
        funcionario.setDataNascimento(new Date());
        funcionario.setTelefone("(11)98665-4321");
        
        Gerente gerente = new Gerente(funcionario);
        
        dao.salvar(gerente);
        System.out.println("Salvo com sucesso");
    }
    
    public void testeBuscar() {
        factoryDao = new FactoryGerenteDAO();
        DAO dao = factoryDao.criarDao();
        
        Gerente funcionario = new Gerente(new Funcionario());
        funcionario.setIdGerente(1L);
        funcionario = (Gerente) dao.buscar(funcionario);
        System.out.println(funcionario.toString());
    }
    
    public void testeListarTodos() {
        factoryDao = new FactoryGerenteDAO();
        DAO dao = factoryDao.criarDao();
        
        List<Gerente> funcionarios = dao.listarTodos();
        for(Gerente func:funcionarios) {
            System.out.println(func.toString());
        }
        System.out.println("Consultado com sucesso");
    }
    
     public void testarExcluir() {
        factoryDao = new FactoryGerenteDAO();
        DAO dao = factoryDao.criarDao();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("123.456.789-99");
        funcionario.setNome("Kedley");
        funcionario.setLogin("kedley");
        funcionario.setSenha("123456");
        funcionario.setDataNascimento(new Date());
        funcionario.setTelefone("(11)98665-4321");
        
        Gerente gerente = new Gerente();
        gerente.setFuncionario(funcionario);
        gerente.setIdGerente(1L);
        
        dao.excluir(gerente);
        System.out.println("Excluído com sucesso");
    }
    
    public static void main(String[] args) {
        TesteGerenteDAO teste = new TesteGerenteDAO();
        //teste.testeSalvar();
        //teste.testeBuscar();
        //teste.testeListarTodos();
        //teste.testarExcluir();
    }
}
