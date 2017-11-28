package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Obra;
import com.fatec.museu.util.FactoryAcervoDAO;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryObraDAO;


public class ControleGerenciarAcervo {
    private FactoryDAO factory = new FactoryObraDAO();
    
    public void registrarObra(Obra obra){
        DAO obraDAO = factory.criarDao();
        obraDAO.salvar(obra);
    }
}
