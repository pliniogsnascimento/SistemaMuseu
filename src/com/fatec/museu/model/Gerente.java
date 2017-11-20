package com.fatec.museu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
    
    @Id
    private Long idGerente;

    @OneToOne
    private Funcionario funcionario;

    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    public Long getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(Long idGerente) {
        this.idGerente = idGerente;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public Gerente(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
