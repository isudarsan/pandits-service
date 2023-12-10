package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pandit_pujas")
public class PanditPuja implements Serializable {
    private static final long serialVersionUID = 783625392959068469L;
    private PanditPujaId id;

    private Pandit pandit;

    private Puja puja;

    @EmbeddedId
    public PanditPujaId getId() {
        return id;
    }

    public void setId(PanditPujaId id) {
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

    @MapsId("pujaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "puja_id", nullable = false)
    public Puja getPuja() {
        return puja;
    }

    public void setPuja(Puja puja) {
        this.puja = puja;
    }

}