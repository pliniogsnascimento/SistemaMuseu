package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.InstituicaoDAO;

public class FactoryInstituicaoDAO implements FactoryDAO{

    @Override
    public DAO criarDao() {
        return new InstituicaoDAO();
    }
    
}
