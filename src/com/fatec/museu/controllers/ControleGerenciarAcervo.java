package com.fatec.museu.controllers;

import com.fatec.museu.dao.DAO;
import com.fatec.museu.model.Obra;
import com.fatec.museu.util.FactoryAcervoDAO;
import com.fatec.museu.util.FactoryDAO;
import com.fatec.museu.util.FactoryObraDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;


public class ControleGerenciarAcervo {
    
    private FactoryDAO factory;
    private DAO obraDao;
    
    public ControleGerenciarAcervo() {
        factory = new FactoryObraDAO();
        obraDao = factory.criarDao();
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
            
            SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
            String data = sdt.format((Date) obra.getDataDeObra().getTime());
            
            registro.add(data);
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
    
    
    public byte[] buscarFotoObra(Long id){
        factory = new FactoryObraDAO();
        DAO obraDAO = factory.criarDao();
        Obra obraid = new Obra();
        obraid.setIdObra(id);
        
        obraid = (Obra)obraDAO.buscar(obraid);
        
        return obraid.getImagem();
    }

    public void registrarObra(Obra obra){
        DAO obraDAO = factory.criarDao();
        obraDAO.salvar(obra);
        JOptionPane.showMessageDialog(null, "Obra cadastrada com sucesso!");
    }

    public void atualizarObra(Obra obra) {
        DAO obraDAO = factory.criarDao();
        obraDAO.salvar(obra);
        JOptionPane.showMessageDialog(null, "Obra atualizada com sucesso!");
    }
}