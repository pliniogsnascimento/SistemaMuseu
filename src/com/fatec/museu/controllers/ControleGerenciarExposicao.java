package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.model.Obra;
import com.fatec.museu.model.Sala;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryExposicaoDAO;
import com.fatec.museu.util.FactoryObraDAO;
import com.fatec.museu.util.FactorySalaDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;


public class ControleGerenciarExposicao {
    private FactoryDAO factory = new FactoryExposicaoDAO();
    
    public void registrarExposicao(Exposicao expo){
        DAO expoDAO = factory.criarDao();
        expoDAO.salvar(expo);
        
        JOptionPane.showMessageDialog(null, "Exposição cadastrada com sucesso!");
    }
    
    public Vector carregarColunas() {
        DAO exposicaoDao = factory.criarDao();
        
        Vector colunas = new Vector();
        
        colunas.add("ID");
        colunas.add("Nome");
        colunas.add("Data de Início");
        colunas.add("Data de Término(Temporária)");
        colunas.add("Sala");
        
        return colunas;
    }
    
    public Vector carregarLinhas() {
        DAO exposicaoDao = factory.criarDao();
        List<Exposicao> exposicoes = exposicaoDao.listarTodos();
        
        Vector linhas = new Vector();
        
        for(Exposicao exposicao:exposicoes) {
            Vector registro = new Vector(4);
            
            registro.add(exposicao.getIdExposicao());
            registro.add(exposicao.getNome());
            
            SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
            String data = sdt.format(exposicao.getDataInicio().getTime());
            registro.add(data);
            
            if(exposicao.getDataTermino() != null) {
                sdt = new SimpleDateFormat("dd/MM/yyyy");
                data = sdt.format((Date) exposicao.getDataTermino().getTime());
                System.out.println(data);
                registro.add(data);
            }
            else {
                registro.add("-");
            }
            
            if(exposicao.getSala() != null) {
                registro.add(exposicao.getSala().getNumeroSala());
            }
            
            
            linhas.add(registro);
        }
        
        return linhas;
    }
    
    public List<String> carrebaObras() {
        FactoryDAO factoryObraDao = new FactoryObraDAO();
        DAO obraDao = factoryObraDao.criarDao();
        
        List<Obra> obras = obraDao.listarTodos();
        
        List<String> obrasSemExposicao = new LinkedList<>();
        for(Obra obra:obras) {
            if(obra.getExposicao() == null) {
                obrasSemExposicao.add(obra.getTitulo());
            }
        }
        
        return obrasSemExposicao;
    }
    
    public List<String> carregaSalas() {
        FactoryDAO factoryObraDao = new FactorySalaDAO();
        DAO salaDao = factoryObraDao.criarDao();
        
        List<Sala> salas = salaDao.listarTodos();
        
        List<String> salaSemExposicao = new LinkedList<>();
        for(Sala sala:salas) {
            if(sala.getExposicao() == null) {
                salaSemExposicao.add(Integer.toString(sala.getNumeroSala()));
            }
        }
        
        return salaSemExposicao;
    }
}
