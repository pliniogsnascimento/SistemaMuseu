package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.FuncionarioDAO;

public class FactoryFuncionarioDAO implements FactoryDAO {

    @Override
    public DAO criarDao() {
        return new FuncionarioDAO();
    }
}
