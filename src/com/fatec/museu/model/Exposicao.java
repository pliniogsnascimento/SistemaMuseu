package com.fatec.museu.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_exposicao")
public class Exposicao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExposicao;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @OneToOne
    private Gerente gerente;
    @OneToMany(targetEntity = Obra.class, mappedBy = "id_exposicao", fetch=FetchType.EAGER)
    private List<Obra> obras;
    @OneToMany(targetEntity = Sala.class, mappedBy = "id_exposicao", fetch=FetchType.EAGER)
    private List<Sala> sala;
    
    public Long getIdExposicao() {
        return idExposicao;
    }

    public void setIdExposicao(Long idExposicao) {
        this.idExposicao = idExposicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }
	
}
