package com.fatec.museu.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Sala implements Serializable {
    
    @Id
    private int numeroSala;
    private int maximoDeVisitantes;
    
    //@ManyToOne
    @OneToOne(targetEntity = Exposicao.class, mappedBy = "sala", fetch = FetchType.EAGER)
    //@JoinColumn(name = "id_exposicao")
    private Exposicao exposicao;

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroDaSala) {
        this.numeroSala = numeroDaSala;
    }

    public int getMaximoDeVisitantes() {
        return maximoDeVisitantes;
    }

    public void setMaximoDeVisitantes(int maximoDeVisitantes) {
        this.maximoDeVisitantes = maximoDeVisitantes;
    }
    
    public Exposicao getExposicao() {
        return exposicao;
    }

    public void setExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroSala=" + numeroSala + ", maximoDeVisitantes=" + maximoDeVisitantes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.numeroSala;
        hash = 37 * hash + this.maximoDeVisitantes;
        hash = 37 * hash + Objects.hashCode(this.exposicao);
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
        final Sala other = (Sala) obj;
        if (this.numeroSala != other.numeroSala) {
            return false;
        }
        if (this.maximoDeVisitantes != other.maximoDeVisitantes) {
            return false;
        }
        if (!Objects.equals(this.exposicao, other.exposicao)) {
            return false;
        }
        return true;
    }

}
