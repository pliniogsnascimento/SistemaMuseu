package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;

public interface FactoryDAO {
    
    public abstract DAO criarDao();
    
}
