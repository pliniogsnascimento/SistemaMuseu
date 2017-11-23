package com.fatec.museu.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_obra")
public class Obra implements Serializable {
    
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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_acervo")
    private Acervo acervo;
    @ManyToOne(fetch = FetchType.EAGER)
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

    public Acervo getAcervo() {
        return acervo;
    }

    public void setAcervo(Acervo acervo) {
        this.acervo = acervo;
    }

    public Exposicao getExposicao() {
        return exposicao;
    }

    public void setExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idObra);
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.dataDeObra);
        hash = 59 * hash + Objects.hashCode(this.tipoDeObra);
        hash = 59 * hash + Objects.hashCode(this.categoria);
        hash = 59 * hash + Objects.hashCode(this.autor);
        hash = 59 * hash + Objects.hashCode(this.dadosBiograficos);
        hash = 59 * hash + Objects.hashCode(this.doadorDeObra);
        hash = 59 * hash + Objects.hashCode(this.acervo);
        hash = 59 * hash + Objects.hashCode(this.exposicao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obra other = (Obra) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.tipoDeObra, other.tipoDeObra)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.dadosBiograficos, other.dadosBiograficos)) {
            return false;
        }
        if (!Objects.equals(this.doadorDeObra, other.doadorDeObra)) {
            return false;
        }
        if (!Objects.equals(this.idObra, other.idObra)) {
            return false;
        }
        if (!Objects.equals(this.dataDeObra, other.dataDeObra)) {
            return false;
        }
        if (!Objects.equals(this.acervo, other.acervo)) {
            return false;
        }
        if (!Objects.equals(this.exposicao, other.exposicao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Obra{" + "idObra=" + idObra + ", titulo=" + titulo + ", dataDeObra=" + dataDeObra + ", tipoDeObra=" + tipoDeObra + ", categoria=" + categoria + ", autor=" + autor + ", dadosBiograficos=" + dadosBiograficos + ", doadorDeObra=" + doadorDeObra + ", acervo=" + acervo + ", exposicao=" + exposicao + '}';
    }
    
        
}
