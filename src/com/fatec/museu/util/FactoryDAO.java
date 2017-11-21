package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;

public abstract class FactoryDAO {
    
    public abstract DAO criarDao();
    
}
