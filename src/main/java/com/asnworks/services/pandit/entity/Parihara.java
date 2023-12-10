package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "parihara")
public class Parihara implements Serializable {
    private static final long serialVersionUID = -3185382295237291768L;
    private Integer id;

    private String name;

    private Set<Pandit> pandits = new LinkedHashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parihara_id", nullable = false)
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

    @ManyToMany(mappedBy = "pariharas")
    public Set<Pandit> getPandits() {
        return pandits;
    }

    public void setPandits(Set<Pandit> pandits) {
        this.pandits = pandits;
    }

}