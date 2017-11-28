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

/**
 *
 * @author Panda
 */
public class ControleGerenciarSala {
    private FactoryDAO factory = new FactorySalaDAO();
    
    public void registrarSala(Sala sala){
        DAO SalaDAO = factory.criarDao();
        SalaDAO.salvar(sala);
    }
}
