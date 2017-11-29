/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Sala;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactorySalaDAO;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Panda
 */
public class ControleGerenciarSala {
    private FactoryDAO factory = new FactorySalaDAO();
    
    public void registrarSala(Sala sala){
        DAO SalaDAO = factory.criarDao();
        SalaDAO.salvar(sala);
        JOptionPane.showMessageDialog(null, "Sala cadastrada com sucesso!");
    }
    
    public Vector carregarLinhas() {
        Vector linhas = new Vector();
        DAO salaDao = factory.criarDao();
        
        List<Sala> salas = salaDao.listarTodos();
        
        for(Sala sala:salas) {
            Vector registro = new Vector();
            
            registro.add(sala.getNumeroSala());
            registro.add(sala.getMaximoDeVisitantes());
            
            if(sala.getExposicao() != null) {
                registro.add(sala.getExposicao().getNome());
            }
            else {
                registro.add("-");
            }
            linhas.add(registro);
        }
        
        return linhas;
    }
    
    public Vector carregarColunas() {
        Vector colunas = new Vector();
        
        colunas.add("Número");
        colunas.add("Máximo de Visitantes");
        colunas.add("Exposição");
        
        return colunas;
    }
}
