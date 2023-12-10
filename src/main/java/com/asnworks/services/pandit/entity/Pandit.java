package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "pandit")
public class Pandit implements Serializable {
    private static final long serialVersionUID = 5957264458653255489L;
    private Integer id;

    private String firstName;

    private String lastName;

    private String gender;

    private Integer age;

    private String primaryMobile;

    private String secondaryMobile;

    private String city;

    private String district;

    private String pincode;

    private String address;

    private Set<Ceremony> ceremonies = new LinkedHashSet<>();

    private Set<Homa> homas = new LinkedHashSet<>();

    private Set<Parihara> pariharas = new LinkedHashSet<>();

    private Set<Puja> pujas = new LinkedHashSet<>();

    private Set<Ritual> rituals = new LinkedHashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pandit_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "gender", length = 50)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "primary_mobile", length = 20)
    public String getPrimaryMobile() {
        return primaryMobile;
    }

    public void setPrimaryMobile(String primaryMobile) {
        this.primaryMobile = primaryMobile;
    }

    @Column(name = "secondary_mobile", length = 20)
    public String getSecondaryMobile() {
        return secondaryMobile;
    }

    public void setSecondaryMobile(String secondaryMobile) {
        this.secondaryMobile = secondaryMobile;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Column(name = "pincode", length = 10)
    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Column(name = "address", length = Integer.MAX_VALUE)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ManyToMany(mappedBy = "pandits")
    public Set<Ceremony> getCeremonies() {
        return ceremonies;
    }

    public void setCeremonies(Set<Ceremony> ceremonies) {
        this.ceremonies = ceremonies;
    }

    @ManyToMany(mappedBy = "pandits")
    public Set<Homa> getHomas() {
        return homas;
    }

    public void setHomas(Set<Homa> homas) {
        this.homas = homas;
    }

    @ManyToMany(mappedBy = "pandits")
    public Set<Parihara> getPariharas() {
        return pariharas;
    }

    public void setPariharas(Set<Parihara> pariharas) {
        this.pariharas = pariharas;
    }

    @ManyToMany(mappedBy = "pandits")
    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }

    @ManyToMany(mappedBy = "pandits")
    public Set<Ritual> getRituals() {
        return rituals;
    }

    public void setRituals(Set<Ritual> rituals) {
        this.rituals = rituals;
    }

}