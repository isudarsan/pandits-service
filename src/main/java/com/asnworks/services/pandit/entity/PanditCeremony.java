package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pandit_ceremonies")
public class PanditCeremony implements Serializable {
    private static final long serialVersionUID = 236097136142229068L;
    private PanditCeremonyId id;

    private Pandit pandit;

    private Ceremony ceremony;

    @EmbeddedId
    public PanditCeremonyId getId() {
        return id;
    }

    public void setId(PanditCeremonyId id) {
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

    @MapsId("ceremonyId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ceremony_id", nullable = false)
    public Ceremony getCeremony() {
        return ceremony;
    }

    public void setCeremony(Ceremony ceremony) {
        this.ceremony = ceremony;
    }

}