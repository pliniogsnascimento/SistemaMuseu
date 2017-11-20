package com.fatec.museu.model;

import java.util.List;
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
    @OneToMany(targetEntity = Obra.class, mappedBy = "acervo" , fetch=FetchType.EAGER)
    private List<Obra> obras;
    private String origemDoAcervo;
    private String descricao;

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
}
