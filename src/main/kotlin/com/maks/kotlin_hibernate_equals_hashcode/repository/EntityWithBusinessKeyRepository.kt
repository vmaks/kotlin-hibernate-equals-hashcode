package com.maks.kotlin_hibernate_equals_hashcode.repository

import com.maks.kotlin_hibernate_equals_hashcode.model.EntityWithBusinessKey
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EntityWithBusinessKeyRepository : JpaRepository<EntityWithBusinessKey, Long>