package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Obra;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryObraDAO;
import java.util.List;
import java.util.Vector;


public class ControleGerenciarAcervo {
    
    private FactoryDAO factoryDao;
    private DAO obraDao;
    
    public ControleGerenciarAcervo() {
        factoryDao = new FactoryObraDAO();
        obraDao = factoryDao.criarDao();
    }
    
    public Vector carregaColuna() {
        
        Vector colunas = new Vector(10);
        colunas.add("ID");
        colunas.add("Título");
        colunas.add("Data de Obra");
        colunas.add("Tipo de Obra");
        colunas.add("Autor");
        colunas.add("Categoria");
        colunas.add("Dados Biográficos");
        colunas.add("Doador");
        colunas.add("Acervo");
        colunas.add("Exposicao");
        
        
        return colunas;
    }
    
    
    public Vector carregaLinhas() {
        List<Obra> obras = obraDao.listarTodos();
        
        Vector linhas = new Vector();
        
        for(Obra obra:obras) {
            Vector registro = new Vector(10);
            
            registro.add(obra.getIdObra());
            registro.add(obra.getTitulo());
            registro.add(obra.getDataDeObra());
            registro.add(obra.getTipoDeObra());
            registro.add(obra.getAutor());
            registro.add(obra.getCategoria());
            registro.add(obra.getDadosBiograficos());
            registro.add(obra.getDoadorDeObra());
            registro.add(obra.getAcervo());
            
            if(obra.getExposicao() != null) {
                registro.add(obra.getExposicao().getNome());
            }
            
            linhas.add(registro);
        }
        
        return linhas;
    }
}
