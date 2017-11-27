/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.model.Sala;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactorySalaDAO;
import java.util.List;

/**
 *
 * @author junig
 */
public class TesteSalaDAO {
    
    private Sala sala;
    private DAO dao;
    
    public TesteSalaDAO() {
        FactoryDAO factory = new FactorySalaDAO();
        dao = factory.criarDao();
        sala = new Sala();
    }
    
    public void testeSalvar() {
        sala.setNumeroSala(2);
        sala.setMaximoDeVisitantes(150);
        Exposicao exposicao = new Exposicao();
        exposicao.setIdExposicao(1L);
        sala.setExposicao(exposicao);
        
        dao.salvar(sala);
        System.out.println("Salvo com sucesso");
    }
    
    public void testeListar() {
        List<Sala> salas = dao.listarTodos();
        
        for(Sala sala1:salas) {
            System.out.println(sala1);
        }
    }
    
    public void testeBuscar() {
        sala.setNumeroSala(1);
        sala = (Sala) dao.buscar(sala);
        System.out.println(sala);
    }
    
    public void testeExcluir() {
        sala.setNumeroSala(1);
        dao.excluir(sala);
    }
    
    public static void main(String[] args) {
        TesteSalaDAO teste = new TesteSalaDAO();
        //teste.testeSalvar();
        //teste.testeListar();
        //teste.testeBuscar();
        //teste.testeExcluir();
    }
    
}
