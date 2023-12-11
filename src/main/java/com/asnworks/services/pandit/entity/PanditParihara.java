package com.asnworks.services.pandit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "pandit_parihara")
public class PanditParihara implements Serializable {

  private static final long serialVersionUID = -7581637598113158032L;
  private PanditPariharaId id;

  private Pandit pandit;

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

}