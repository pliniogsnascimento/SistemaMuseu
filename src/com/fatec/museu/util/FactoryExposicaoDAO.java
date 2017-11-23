/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.util;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.dao.ExposicaoDAO;

/**
 *
 * @author junig
 */
public class FactoryExposicaoDAO implements FactoryDAO {

    @Override
    public DAO criarDao() {
        return new ExposicaoDAO();
    }
    
}
