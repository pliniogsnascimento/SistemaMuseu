package com.fatec.museu.model;

public class Gerente extends Funcionario {
	
    Acervo acervo; //Verificar

    public Acervo getAcervo() {
        return acervo;
    }

    public void setAcervo(Acervo acervo) {
        this.acervo = acervo;
    }
}
