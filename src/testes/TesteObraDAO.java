package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Acervo;
import com.fatec.museu.model.Obra;
import com.fatec.museu.util.FactoryObraDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteObraDAO {
    
    private Obra obra;
    private DAO dao;
    
    public TesteObraDAO() {
        FactoryObraDAO factory = new FactoryObraDAO();
        dao = factory.criarDao();
        obra = new Obra();
    }
    
    public void testeSalvar() {
        obra.setTitulo("Monalisa");
        obra.setAutor("Leonardo Da Vinci");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            obra.setDataDeObra(format.parse("15/03/1503"));
        } catch (ParseException ex) {
            Logger.getLogger(TesteObraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        obra.setAcervo(new Acervo());
        obra.getAcervo().setIdAcervo(5L);
        dao.salvar(obra);
    }
    
    public void testeListar() {
        List<Obra> obras = dao.listarTodos();
        
        for(Obra obra:obras) {
            System.out.println(obra.toString());
        }
    }
    
    public void testeBuscar() {
        obra.setIdObra(1L);
        obra = (Obra) dao.buscar(obra);
        System.out.println(obra.toString());
    }
    
    public void testeRemover() {
        obra.setIdObra(2L);
        dao.excluir(obra);
    }
    
    public static void main(String[] args) {
        TesteObraDAO teste = new TesteObraDAO();
        //teste.testeSalvar();
        //teste.testeListar();
        //teste.testeBuscar();
        teste.testeRemover();
    }
    
}
