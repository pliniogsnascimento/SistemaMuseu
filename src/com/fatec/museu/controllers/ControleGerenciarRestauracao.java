package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Restauracao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryRestauracaoDAO;

public class ControleGerenciarRestauracao {
    private FactoryDAO factory = new FactoryRestauracaoDAO();
    
    public void registrarInstituicao(Restauracao rest){
        DAO restDAO = factory.criarDao();
        restDAO.salvar(rest);
    }
}
