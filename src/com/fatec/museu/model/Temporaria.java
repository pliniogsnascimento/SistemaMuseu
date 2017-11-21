package com.fatec.museu.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Temporaria extends Exposicao {
    
    @Temporal(TemporalType.DATE)
    private Date dataFim;

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
}
