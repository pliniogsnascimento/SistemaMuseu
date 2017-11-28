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

/**
 *
 * @author Panda
 */
public class ControleGerenciarInstituicao {
    private FactoryDAO factory = new FactoryInstituicaoDAO();
    
    public void registrarInstituicao(Instituicao inst){
        DAO instDAO = factory.criarDao();
        instDAO.salvar(inst);
    }
    
}
