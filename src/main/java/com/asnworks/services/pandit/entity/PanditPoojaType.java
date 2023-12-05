package com.asnworks.services.pandit.entity;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PanditPoojaTypes")
public class PanditPoojaType extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "pandit_id")
    private Pandit pandit;

    @ManyToOne
    @JoinColumn(name = "pooja_type_id")
    private PoojaType poojaType;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public PanditPoojaType (){

    }

    public Pandit getPandit() {
        return pandit;
    }

    public PoojaType getPoojaType() {
        return poojaType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setPandit(Pandit pandit) {
        this.pandit = pandit;
    }

    public void setPoojaType(PoojaType poojaType) {
        this.poojaType = poojaType;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}
