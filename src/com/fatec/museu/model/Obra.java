package com.fatec.museu.model;

import java.util.Date;

public class Obra {

    private String titulo;
    private Date dataDeObra;
    private TipoDeObra tipoDeObra;
    private String categoria;
    private String autor;
    private String dadosBiograficos;
    private String doadorDeObra;
	
    public TipoDeObra getTipoDeObra() {
	return tipoDeObra;
    }
    public void setTipoDeObra(TipoDeObra tipoDeObra) {
	this.tipoDeObra = tipoDeObra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataDeObra() {
        return dataDeObra;
    }

    public void setDataDeObra(Date dataDeObra) {
        this.dataDeObra = dataDeObra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDadosBiograficos() {
        return dadosBiograficos;
    }

    public void setDadosBiograficos(String dadosBiograficos) {
        this.dadosBiograficos = dadosBiograficos;
    }

    public String getDoadorDeObra() {
        return doadorDeObra;
    }

    public void setDoadorDeObra(String doadorDeObra) {
        this.doadorDeObra = doadorDeObra;
    }
        
	
	
	
}
