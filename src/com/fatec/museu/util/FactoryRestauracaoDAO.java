package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.RestauracaoDAO;

public class FactoryRestauracaoDAO implements FactoryDAO{

    @Override
    public DAO criarDao() {
        return new RestauracaoDAO();
    }
    
}
