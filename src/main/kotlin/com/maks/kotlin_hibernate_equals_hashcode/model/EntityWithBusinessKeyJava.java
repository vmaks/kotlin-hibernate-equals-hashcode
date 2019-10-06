package com.maks.kotlin_hibernate_equals_hashcode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class EntityWithBusinessKeyJava {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate date;

    private String message;

    private String businessKey;

    private EntityWithBusinessKeyJava() {}

    public EntityWithBusinessKeyJava(String businessKey) {
        this.businessKey = businessKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        EntityWithBusinessKeyJava otherEntity = (EntityWithBusinessKeyJava) other;

        return Objects.equals(businessKey, otherEntity.businessKey);

    }

    @Override
    public int hashCode() {
        return businessKey != null ? businessKey.hashCode() : 0;
    }
}
