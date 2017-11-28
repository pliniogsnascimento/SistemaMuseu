package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Restauracao;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryRestauracaoDAO;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

public class ControleGerenciarRestauracao {
    private FactoryDAO factory = new FactoryRestauracaoDAO();
    
    public void registrarInstituicao(Restauracao rest){
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
}
