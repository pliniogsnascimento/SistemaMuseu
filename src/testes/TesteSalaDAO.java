/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Sala;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactorySalaDAO;

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
        Sala sala = new Sala();
    }
    
    public void testeSalvar() {
        
    }
    
    public void testeListar() {
        
    }
    
    public void testeBuscar() {
        
    }
    
    public void testeExcluir() {
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
