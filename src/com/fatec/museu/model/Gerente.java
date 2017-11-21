package com.fatec.museu.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGerente;

    @OneToOne(cascade = CascadeType.ALL)
    private Funcionario funcionario;
    
    public Gerente() {
        
    }
    
    public Gerente(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.idGerente);
        hash = 79 * hash + Objects.hashCode(this.funcionario);
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
        final Gerente other = (Gerente) obj;
        if (!Objects.equals(this.idGerente, other.idGerente)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gerente{" + "idGerente=" + idGerente + ", funcionario=" + funcionario + '}';
    }
    
}
