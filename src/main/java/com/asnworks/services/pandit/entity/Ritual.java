package com.asnworks.services.pandit.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "rituals")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "ritual_id", nullable = false))
})
public class Ritual extends PanacheEntity implements Serializable {
    private static final long serialVersionUID = -7758715065448329881L;
    private String name;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}