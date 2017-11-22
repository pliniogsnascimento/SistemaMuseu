package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.ObraDAO;

public class FactoryObraDAO implements FactoryDAO{

    @Override
    public DAO criarDao() {
        return new ObraDAO();
    }
    
}
