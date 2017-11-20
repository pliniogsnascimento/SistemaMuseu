package com.fatec.museu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
    
    @Id
    @OneToOne
    private Funcionario funcionario;
    
    public Gerente(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
