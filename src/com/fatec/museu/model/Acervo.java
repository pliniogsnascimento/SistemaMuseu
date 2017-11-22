package com.fatec.museu.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Acervo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAcervo;
    @OneToMany(targetEntity = Obra.class, mappedBy = "acervo" , fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Obra> obras;
    private String origemDoAcervo;
    private String descricao;
    
    public Long getIdAcervo() {
        return idAcervo;
    }

    public void setIdAcervo(Long idAcervo) {
        this.idAcervo = idAcervo;
    }

    public List<Obra> getObras() {
        return this.obras;
    }

    public void setObras(List<Obra> obra) {
        this.obras = obras;
    }

    public String getOrigemDoAcervo() {
        return origemDoAcervo;
    }

    public void setOrigemDoAcervo(String origemDoAcervo) {
        this.origemDoAcervo = origemDoAcervo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idAcervo);
        hash = 89 * hash + Objects.hashCode(this.obras);
        hash = 89 * hash + Objects.hashCode(this.origemDoAcervo);
        hash = 89 * hash + Objects.hashCode(this.descricao);
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
        final Acervo other = (Acervo) obj;
        if (!Objects.equals(this.origemDoAcervo, other.origemDoAcervo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.idAcervo, other.idAcervo)) {
            return false;
        }
        if (!Objects.equals(this.obras, other.obras)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Acervo{" + "idAcervo=" + idAcervo + ", obras=" + obras + ", origemDoAcervo=" + origemDoAcervo + ", descricao=" + descricao + '}';
    }
    
    
}
