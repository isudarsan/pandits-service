package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pandit_rituals")
public class PanditRitual implements Serializable {
    private static final long serialVersionUID = -6147230693930377620L;
    private PanditRitualId id;

    private Pandit pandit;

    private Ritual ritual;

    @EmbeddedId
    public PanditRitualId getId() {
        return id;
    }

    public void setId(PanditRitualId id) {
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

    @MapsId("ritualId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ritual_id", nullable = false)
    public Ritual getRitual() {
        return ritual;
    }

    public void setRitual(Ritual ritual) {
        this.ritual = ritual;
    }

}