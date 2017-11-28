package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.ExposicaoDAO;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryExposicaoDAO;


public class ControleGerenciarExposicao {
    private FactoryDAO factory = new FactoryExposicaoDAO();
    
    public void registrarExposicao(Exposicao expo){
        DAO expoDAO = factory.criarDao();
        expoDAO.salvar(expo);
    }
}
