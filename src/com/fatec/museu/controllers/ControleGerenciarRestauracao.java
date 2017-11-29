package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Instituicao;
import com.fatec.museu.model.Obra;
import com.fatec.museu.model.Restauracao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryInstituicaoDAO;
import com.fatec.museu.util.FactoryObraDAO;
import com.fatec.museu.util.FactoryRestauracaoDAO;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import com.fatec.museu.dao.InstituicaoDAO;
import com.fatec.museu.dao.ObraDAO;

public class ControleGerenciarRestauracao {
    private FactoryDAO factory = new FactoryRestauracaoDAO();
    
    public void registrarInstituicao(Restauracao rest){
        factory = new FactoryRestauracaoDAO();
        DAO restDAO = factory.criarDao();
        restDAO.salvar(rest);
    }
    
    public Vector carregarLinhas() {
        Vector linhas = new Vector();
        DAO restDao = factory.criarDao();
        List<Restauracao> restauracoes = restDao.listarTodos();
        
        for(Restauracao restauracao:restauracoes) {
            Vector registro = new Vector();
            registro.add(restauracao.getIdRestauracao());
            registro.add(restauracao.getObra().getTitulo());
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dataEnvio = sdf.format(restauracao.getDataDeEnvio().getTime());
            String dataRetorno = sdf.format(restauracao.getDataDeRetorno().getTime());
            
            registro.add(dataEnvio);
            registro.add(dataRetorno);
            registro.add(restauracao.getStatus());
            registro.add(restauracao.getDescricao());
            registro.add(restauracao.getInstituicao().getNome());
            
            linhas.add(registro);
        }
        
        return linhas;
    }
    
    public Vector carregarColunas() {
        Vector colunas = new Vector();
        
        colunas.add("ID");
        colunas.add("Obra");
        colunas.add("Data de Envio");
        colunas.add("Data de Retorno");
        colunas.add("Status");
        colunas.add("Descrição");
        colunas.add("Instituição");
        
        return colunas;
    }
    
    public List<String> carregaObras() {
        DAO restDao = factory.criarDao();
        factory = new FactoryObraDAO();
        DAO obraDao = factory.criarDao();
        
        List<Obra> obras = obraDao.listarTodos();
        
        List<Restauracao> restauracoes = restDao.listarTodos();
        
        for(Restauracao restauracao:restauracoes) {
            obras.remove(restauracao.getObra());
        }
        
        List<String> nomeObras = new LinkedList<>();
        
        for(Obra obra:obras) {
            nomeObras.add(obra.getTitulo());
        }
        
        return nomeObras;
    }
    
    public List<String> carregaInstituicao() {
        factory = new FactoryInstituicaoDAO();
        DAO instDao = factory.criarDao();
        
        List<String> nomeInst = new LinkedList();
        List<Instituicao> instituicoes = instDao.listarTodos();
        for(Instituicao instituicao:instituicoes) {
            nomeInst.add(instituicao.getNome());
        }
        
        return nomeInst;
    }
    
    public Instituicao getInstituicaoPorNome(String nome) {
        factory = new FactoryInstituicaoDAO();
        InstituicaoDAO instituicaoDao = (InstituicaoDAO) factory.criarDao();
        
        return instituicaoDao.buscarPorNome(nome);
    }
    
    public Obra getObraPorNome(String nome) {
        factory = new FactoryObraDAO();
        ObraDAO obraDao = (ObraDAO) factory.criarDao();
        
        return obraDao.buscarPorNome(nome);
    }
}
