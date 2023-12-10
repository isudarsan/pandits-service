package com.asnworks.services.pandit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PanditPujaId implements Serializable {
    private static final long serialVersionUID = 4049403342274116632L;
    private Integer panditId;

    private Integer pujaId;

    @Column(name = "pandit_id", nullable = false)
    public Integer getPanditId() {
        return panditId;
    }

    public void setPanditId(Integer panditId) {
        this.panditId = panditId;
    }

    @Column(name = "puja_id", nullable = false)
    public Integer getPujaId() {
        return pujaId;
    }

    public void setPujaId(Integer pujaId) {
        this.pujaId = pujaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PanditPujaId entity = (PanditPujaId) o;
        return Objects.equals(this.pujaId, entity.pujaId) &&
                Objects.equals(this.panditId, entity.panditId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pujaId, panditId);
    }

}