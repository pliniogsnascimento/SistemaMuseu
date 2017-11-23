package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.SalaDAO;

public class FactorySalaDAO implements FactoryDAO {

    @Override
    public DAO criarDao() {
        return new SalaDAO();
    }
    
}   
