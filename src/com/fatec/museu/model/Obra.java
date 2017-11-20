package com.fatec.museu.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

class Endereco {
    
}

@Entity
@Table(name = "tb_obra")
public class Obra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idObra;
    private String titulo;
    @Temporal(TemporalType.DATE)
    private Date dataDeObra;
    private String tipoDeObra;
    private String categoria;
    private String autor;
    private String dadosBiograficos;
    private String doadorDeObra;
    @OneToOne
    @JoinColumn(name = "id_acervo")
    private Acervo acervo;
    @ManyToOne
    @JoinColumn(name = "id_exposicao")
    private Exposicao exposicao;
    
    public Long getIdObra() {
        return idObra;
    }

    public void setIdObra(Long idObra) {
        this.idObra = idObra;
    }
	
    public String getTipoDeObra() {
	return tipoDeObra;
    }
    public void setTipoDeObra(String tipoDeObra) {
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
