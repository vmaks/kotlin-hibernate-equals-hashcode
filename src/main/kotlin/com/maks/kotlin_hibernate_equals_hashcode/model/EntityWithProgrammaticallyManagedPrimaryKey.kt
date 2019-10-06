package com.maks.kotlin_hibernate_equals_hashcode.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id

/**
 * Hibernate assumes 0 as uninitialized entity
 */
@Entity
class EntityWithProgrammaticallyManagedPrimaryKey(
    @Id
    val id: Long,
    val date: LocalDate,
    val message: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as EntityWithProgrammaticallyManagedPrimaryKey

        if (id == 0L && id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}