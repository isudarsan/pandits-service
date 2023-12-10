package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pandit_parihara")
public class PanditParihara implements Serializable {
    private static final long serialVersionUID = -4456956754525293609L;
    private PanditPariharaId id;

    private Pandit pandit;

    private Parihara parihara;

    @EmbeddedId
    public PanditPariharaId getId() {
        return id;
    }

    public void setId(PanditPariharaId id) {
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

    @MapsId("pariharaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "parihara_id", nullable = false)
    public Parihara getParihara() {
        return parihara;
    }

    public void setParihara(Parihara parihara) {
        this.parihara = parihara;
    }

}