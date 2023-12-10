package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "homas")
public class Homa implements Serializable {
    private static final long serialVersionUID = 7858764540335400198L;
    private Integer id;

    private String name;

    private Set<Pandit> pandits = new LinkedHashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "homa_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(name = "pandit_homas",
            joinColumns = @JoinColumn(name = "homa_id"),
            inverseJoinColumns = @JoinColumn(name = "pandit_id"))
    public Set<Pandit> getPandits() {
        return pandits;
    }

    public void setPandits(Set<Pandit> pandits) {
        this.pandits = pandits;
    }

}