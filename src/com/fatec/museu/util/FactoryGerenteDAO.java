package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.GerenteDAO;

public class FactoryGerenteDAO extends FactoryDAO {

    @Override
    public DAO criarDao() {
        return new GerenteDAO();
    }
    
    
    
}
