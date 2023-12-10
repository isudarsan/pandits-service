package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pandit_homas")
public class PanditHoma implements Serializable {
    private static final long serialVersionUID = 2164869182495962230L;
    private PanditHomaId id;

    private Pandit pandit;

    private Homa homa;

    @EmbeddedId
    public PanditHomaId getId() {
        return id;
    }

    public void setId(PanditHomaId id) {
        this.id = id;
    }

    @MapsId("panditId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pandit_id", nullable = false)
    public Pandit getPandit() {
        return pandit;
    }

    public void setPandit(Pandit pandit) {
        this.pandit = pandit;
    }

    @MapsId("homaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "homa_id", nullable = false)
    public Homa getHoma() {
        return homa;
    }

    public void setHoma(Homa homa) {
        this.homa = homa;
    }

}