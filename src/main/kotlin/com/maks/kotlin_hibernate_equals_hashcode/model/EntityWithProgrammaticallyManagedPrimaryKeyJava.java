package com.maks.kotlin_hibernate_equals_hashcode.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class EntityWithProgrammaticallyManagedPrimaryKeyJava {
    @Id
    private Long id;

    private LocalDate date;

    private String message;

    private EntityWithProgrammaticallyManagedPrimaryKeyJava() {}

    public EntityWithProgrammaticallyManagedPrimaryKeyJava(Long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityWithProgrammaticallyManagedPrimaryKeyJava myEntity = (EntityWithProgrammaticallyManagedPrimaryKeyJava) o;

        return Objects.equals(id, myEntity.id);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
