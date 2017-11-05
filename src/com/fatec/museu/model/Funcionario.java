package com.fatec.museu.model;

import java.util.Date;

public class Funcionario {
	private String nome;
        private String cpf;
        private String telefone;
        private Date datanaNascimento;
        private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDatanaNascimento() {
        return datanaNascimento;
    }

    public void setDatanaNascimento(Date datanaNascimento) {
        this.datanaNascimento = datanaNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
        
        
}
