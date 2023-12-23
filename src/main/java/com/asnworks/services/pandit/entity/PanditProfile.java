package com.asnworks.services.pandit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "pandit_profile")
public class PanditProfile implements Serializable {

  private static final long serialVersionUID = 6338865098146113952L;
  private UUID id;

  private String firstName;

  private String lastName;

  private String fullName;

  private String gender;

  private LocalDate dateOfBirth;

  private UserRegistration primaryMobileNumber;

  private String alternateMobileNumber;

  private String email;

  private String city;

  private String village;

  private String district;

  private String address;

  private OffsetDateTime createdOn;

  private OffsetDateTime updatedOn;

  private String createdBy;

  private String updatedBy;

  @Id
  @Column(name = "pandit_id", nullable = false)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  @Column(name = "first_name", nullable = false, length = 50)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Column(name = "last_name", nullable = false, length = 50)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Column(name = "full_name", nullable = false, length = 100)
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Column(name = "gender", length = 10)
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Column(name = "date_of_birth")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "primary_mobile_number", referencedColumnName = "mobile_number")
  public UserRegistration getPrimaryMobileNumber() {
    return primaryMobileNumber;
  }

  public void setPrimaryMobileNumber(UserRegistration primaryMobileNumber) {
    this.primaryMobileNumber = primaryMobileNumber;
  }

  @Column(name = "alternate_mobile_number", length = 20)
  public String getAlternateMobileNumber() {
    return alternateMobileNumber;
  }

  public void setAlternateMobileNumber(String alternateMobileNumber) {
    this.alternateMobileNumber = alternateMobileNumber;
  }

  @Column(name = "email", length = 100)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "city", length = 50)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Column(name = "village", length = 50)
  public String getVillage() {
    return village;
  }

  public void setVillage(String village) {
    this.village = village;
  }

  @Column(name = "district", length = 50)
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  @Column(name = "address", length = Integer.MAX_VALUE)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
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