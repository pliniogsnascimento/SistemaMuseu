package com.fatec.museu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sala {
    
    @Id
    private int numeroSala;
    private int maximoDeVisitantes;
    
    @ManyToOne
    @Column(name = "id_exposicao")
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
    
}
