package com.asnworks.services.pandit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PanditHomaId implements Serializable {

  private static final long serialVersionUID = -4094947224003163635L;
  private Integer panditId;

  private Integer homaId;

  @Column(name = "pandit_id", nullable = false)
  public Integer getPanditId() {
    return panditId;
  }

  public void setPanditId(Integer panditId) {
    this.panditId = panditId;
  }

  @Column(name = "homa_id", nullable = false)
  public Integer getHomaId() {
    return homaId;
  }

  public void setHomaId(Integer homaId) {
    this.homaId = homaId;
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
          return false;
      }
    PanditHomaId entity = (PanditHomaId) o;
    return Objects.equals(this.homaId, entity.homaId) &&
        Objects.equals(this.panditId, entity.panditId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homaId, panditId);
  }

}