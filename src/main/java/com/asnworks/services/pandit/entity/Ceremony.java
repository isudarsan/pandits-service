package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ceremonies")
public class Ceremony implements Serializable {
    private static final long serialVersionUID = 3538094208413938201L;
    private Integer id;

    private String name;

    private Set<Pandit> pandits = new LinkedHashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ceremony_id", nullable = false)
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
    @JoinTable(name = "pandit_ceremonies",
            joinColumns = @JoinColumn(name = "ceremony_id"),
            inverseJoinColumns = @JoinColumn(name = "pandit_id"))
    public Set<Pandit> getPandits() {
        return pandits;
    }

    public void setPandits(Set<Pandit> pandits) {
        this.pandits = pandits;
    }

}