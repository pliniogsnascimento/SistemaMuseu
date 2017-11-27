package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.ObraDAO;
import com.fatec.museu.model.Acervo;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.model.Obra;
import com.fatec.museu.util.FactoryObraDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteObraDAO {
    
    private Obra obra;
    private ObraDAO dao;
    
    public TesteObraDAO() {
        FactoryObraDAO factory = new FactoryObraDAO();
        dao = (ObraDAO) factory.criarDao();
        obra = new Obra();
    }
    
    public void testeSalvar() {
        //obra.setIdObra(13L);
        obra.setTitulo("Monalisa");
        obra.setAutor("Leonardo Da Vinci");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            obra.setDataDeObra(format.parse("15/03/1503"));
        } catch (ParseException ex) {
            Logger.getLogger(TesteObraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Exposicao exposicao = new Exposicao();
        exposicao.setIdExposicao(9L);
        obra.setExposicao(exposicao);
        /*
        obra.setAcervo(new Acervo());
        obra.getAcervo().setIdAcervo(4L);
        */
        System.out.println(obra);
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
        obra.setIdObra(15L);
        dao.excluir(obra);
    }
    
    public void testeDesvincular() {
        dao.desvincularFK(6L);
    }
    
    public static void main(String[] args) {
        TesteObraDAO teste = new TesteObraDAO();
        teste.testeSalvar();
        //teste.testeListar();
        //teste.testeBuscar();
        //teste.testeRemover();
        //teste.testeDesvincular();
    }
    
}
