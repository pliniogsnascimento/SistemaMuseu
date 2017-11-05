package com.fatec.museu.model;

public class Sala {
    private int numeroDaSala;
    private int maximoDeVisitantes;
    private boolean salaReservada;

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public int getMaximoDeVisitantes() {
        return maximoDeVisitantes;
    }

    public void setMaximoDeVisitantes(int maximoDeVisitantes) {
        this.maximoDeVisitantes = maximoDeVisitantes;
    }

    public boolean isSalaReservada() {
        return salaReservada;
    }

    public void setSalaReservada(boolean salaReservada) {
        this.salaReservada = salaReservada;
    }
    
}
