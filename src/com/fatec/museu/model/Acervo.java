package com.fatec.museu.model;



public class Acervo {
	
	private Obra obra;
        private String origemDoAcervo;
        private String descricao;

    public Obra getObra() {
        return this.obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
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
