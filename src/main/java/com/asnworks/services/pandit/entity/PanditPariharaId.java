package com.asnworks.services.pandit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PanditPariharaId implements Serializable {
    private static final long serialVersionUID = -1285981037620611995L;
    private Integer panditId;

    private Integer pariharaId;

    @Column(name = "pandit_id", nullable = false)
    public Integer getPanditId() {
        return panditId;
    }

    public void setPanditId(Integer panditId) {
        this.panditId = panditId;
    }

    @Column(name = "parihara_id", nullable = false)
    public Integer getPariharaId() {
        return pariharaId;
    }

    public void setPariharaId(Integer pariharaId) {
        this.pariharaId = pariharaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PanditPariharaId entity = (PanditPariharaId) o;
        return Objects.equals(this.pariharaId, entity.pariharaId) &&
                Objects.equals(this.panditId, entity.panditId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pariharaId, panditId);
    }

}