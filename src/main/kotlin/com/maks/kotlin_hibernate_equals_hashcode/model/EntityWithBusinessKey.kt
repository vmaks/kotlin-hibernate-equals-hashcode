package com.maks.kotlin_hibernate_equals_hashcode.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Hibernate assumes 0 as uninitialized entity
 */
@Entity
class EntityWithBusinessKey(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    val date: LocalDate,
    val message: String,
    val businessKey: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as EntityWithBusinessKey

        if (id == 0L && businessKey != other.businessKey) return false

        return true
    }

    override fun hashCode(): Int {
        return businessKey.hashCode()
    }

    override fun toString(): String {
        return "EntityWithBusinessKey(id=$id, date=$date, message='$message', businessKey='$businessKey')"
    }
}