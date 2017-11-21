package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Funcionario;

import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryFuncionarioDAO;
import java.util.Date;
import java.util.List;


public class TesteFuncionarioDAO {
    
    public static FactoryDAO factoryDao;
    
    public void testeSalvar() {
        factoryDao = new FactoryFuncionarioDAO();
        DAO dao = factoryDao.criarDao();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("123.456.789-99");
        funcionario.setNome("Kedley");
        funcionario.setLogin("kedley");
        funcionario.setSenha("123456");
        funcionario.setDataNascimento(new Date());
        funcionario.setTelefone("(11)98665-4321");
        
        dao.salvar(funcionario);
        
    }
    
    public void testeListarTodos() {
        factoryDao = new FactoryFuncionarioDAO();
        DAO dao = factoryDao.criarDao();
        
        List<Funcionario> funcionarios = dao.listarTodos();
        for(Funcionario func:funcionarios) {
            System.out.println(func.toString());
        }
        System.out.println("Consultado com sucesso");
    }
    
    public void testarExcluir() {
        factoryDao = new FactoryFuncionarioDAO();
        DAO dao = factoryDao.criarDao();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("123.456.789-99");
        funcionario.setNome("Kedley");
        funcionario.setLogin("kedley");
        funcionario.setSenha("123456");
        funcionario.setDataNascimento(new Date());
        funcionario.setTelefone("(11)98665-4321");
        
        dao.excluir(funcionario);
        System.out.println("Excluído com sucesso");
    }
    
    public void testeBuscar() {
        factoryDao = new FactoryFuncionarioDAO();
        DAO dao = factoryDao.criarDao();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("123.456.789-99");
        funcionario.setNome("Kedley");
        funcionario.setLogin("kedley");
        funcionario.setSenha("123456");
        funcionario.setDataNascimento(new Date());
        funcionario.setTelefone("(11)98665-4321");
        
        Funcionario funcionario1 = (Funcionario) dao.buscar(funcionario);
        
        System.out.println(funcionario1.toString());
        
        if(funcionario.equals(funcionario1)) {
            System.out.println("Buscado com sucesso");
        }
    }
    
    
    public static void main(String[] args) {
        TesteFuncionarioDAO dao = new TesteFuncionarioDAO();
        
        dao.testeSalvar();
        //dao.testeListarTodos();
        //dao.testeBuscar();
        dao.testarExcluir();
    }
    
}
