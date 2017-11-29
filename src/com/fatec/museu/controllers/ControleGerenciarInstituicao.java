/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Instituicao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryInstituicaoDAO;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Panda
 */
public class ControleGerenciarInstituicao {
    private FactoryDAO factory = new FactoryInstituicaoDAO();
    
    public void registrarInstituicao(Instituicao inst){
        DAO instDAO = factory.criarDao();
        instDAO.salvar(inst);
        JOptionPane.showMessageDialog(null, "Instituição cadastrada com sucesso");
    }
    
    public Vector carregaColunas() {
        Vector colunas = new Vector();
        
        colunas.add("ID");
        colunas.add("Nome");
        colunas.add("Telefone");
        colunas.add("Endereço");
        
        return colunas;
    }
    
    public Vector carregaLinhas() {
        Vector linhas = new Vector();
        
        DAO instituicaoDao = factory.criarDao();
        List<Instituicao> instituicoes = instituicaoDao.listarTodos();
        
        for(Instituicao instituicao:instituicoes) {
            Vector registro = new Vector();
            
            registro.add(instituicao.getIdInstituicao());
            registro.add(instituicao.getNome());
            registro.add(instituicao.getTelefone());
            registro.add(instituicao.getEndereco());
            
            linhas.add(registro);
        }
        
        return linhas;
    }
    
}
