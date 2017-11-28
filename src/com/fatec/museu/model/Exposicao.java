package com.fatec.museu.model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Calendar dataInicio;
   
    @Temporal(TemporalType.DATE)
    private Calendar dataTermino;
    /*
    @OneToOne(fetch=FetchType.EAGER)
    private Gerente gerente;
*/
    @OneToMany(targetEntity = Obra.class, mappedBy = "exposicao", fetch=FetchType.EAGER, orphanRemoval = true)
    private List<Obra> obras;
    //@OneToMany(targetEntity = Sala.class, mappedBy = "exposicao", fetch=FetchType.EAGER, orphanRemoval = true)
    @OneToOne(fetch = FetchType.EAGER)
    private Sala sala;
    
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

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    /*
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    */
    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idExposicao);
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.dataInicio);
        //hash = 47 * hash + Objects.hashCode(this.gerente);
        hash = 47 * hash + Objects.hashCode(this.obras);
        hash = 47 * hash + Objects.hashCode(this.sala);
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
        final Exposicao other = (Exposicao) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.idExposicao, other.idExposicao)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        /*
        if (!Objects.equals(this.gerente, other.gerente)) {
            return false;
        }
*/
        if (!Objects.equals(this.obras, other.obras)) {
            return false;
        }
        if (!Objects.equals(this.sala, other.sala)) {
            return false;
        }
        return true;
    }

    public Calendar getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Calendar dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return "Exposicao{" + "idExposicao=" + idExposicao + ", nome=" + nome + ", dataInicio=" + dataInicio + ", obras=" + obras + ", sala=" + sala + '}';
    }
    
}
