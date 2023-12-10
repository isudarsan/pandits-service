package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "rituals")
public class Ritual implements Serializable {
    private static final long serialVersionUID = 4357889312930130297L;
    private Integer id;

    private String name;

    private Set<Pandit> pandits = new LinkedHashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ritual_id", nullable = false)
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

    @ManyToMany(mappedBy = "rituals")
    public Set<Pandit> getPandits() {
        return pandits;
    }

    public void setPandits(Set<Pandit> pandits) {
        this.pandits = pandits;
    }

}