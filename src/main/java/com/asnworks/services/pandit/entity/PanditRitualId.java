package com.asnworks.services.pandit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PanditRitualId implements Serializable {

  private static final long serialVersionUID = 2134392790985314401L;
  private Integer panditId;

  private Integer ritualId;

  @Column(name = "pandit_id", nullable = false)
  public Integer getPanditId() {
    return panditId;
  }

  public void setPanditId(Integer panditId) {
    this.panditId = panditId;
  }

  @Column(name = "ritual_id", nullable = false)
  public Integer getRitualId() {
    return ritualId;
  }

  public void setRitualId(Integer ritualId) {
    this.ritualId = ritualId;
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
          return false;
      }
    PanditRitualId entity = (PanditRitualId) o;
    return Objects.equals(this.panditId, entity.panditId) &&
        Objects.equals(this.ritualId, entity.ritualId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(panditId, ritualId);
  }

}