package com.asnworks.services.pandit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PanditCeremonyId implements Serializable {
    private static final long serialVersionUID = 4289686262755265122L;
    private Integer panditId;

    private Integer ceremonyId;

    @Column(name = "pandit_id", nullable = false)
    public Integer getPanditId() {
        return panditId;
    }

    public void setPanditId(Integer panditId) {
        this.panditId = panditId;
    }

    @Column(name = "ceremony_id", nullable = false)
    public Integer getCeremonyId() {
        return ceremonyId;
    }

    public void setCeremonyId(Integer ceremonyId) {
        this.ceremonyId = ceremonyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PanditCeremonyId entity = (PanditCeremonyId) o;
        return Objects.equals(this.panditId, entity.panditId) &&
                Objects.equals(this.ceremonyId, entity.ceremonyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(panditId, ceremonyId);
    }

}