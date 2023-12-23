package com.asnworks.services.pandit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
@Table(name = "ritual")
public class Ritual implements Serializable {

  private static final long serialVersionUID = -9097107075030940531L;
  private Integer id;

  private String ritualName;

  private OffsetDateTime createdOn;

  private OffsetDateTime updatedOn;

  private String createdBy;

  private String updatedBy;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ritual_id", nullable = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "ritual_name", nullable = false, length = 100)
  public String getRitualName() {
    return ritualName;
  }

  public void setRitualName(String ritualName) {
    this.ritualName = ritualName;
  }

  @Column(name = "created_on")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  @Column(name = "updated_on")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  @Column(name = "created_by", length = 50)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  @Column(name = "updated_by", length = 50)
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

}