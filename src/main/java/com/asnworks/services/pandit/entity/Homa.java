package com.asnworks.services.pandit.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "homas")
public class Homa implements Serializable {
    private static final long serialVersionUID = 8243540880525988059L;
    private Integer id;

    private String name;

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

}