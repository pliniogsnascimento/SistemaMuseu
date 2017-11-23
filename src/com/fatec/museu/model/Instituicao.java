package com.fatec.museu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instituicao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idInstituicao;
    private String nome;
    private String telefone;
    private String endereco;

    public Long getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(Long idInstituicao) {
        this.idInstituicao = idInstituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
