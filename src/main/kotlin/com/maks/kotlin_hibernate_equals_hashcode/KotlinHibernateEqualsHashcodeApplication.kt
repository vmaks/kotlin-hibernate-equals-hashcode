package com.maks.kotlin_hibernate_equals_hashcode

import com.maks.kotlin_hibernate_equals_hashcode.model.EntityWithBusinessKey
import com.maks.kotlin_hibernate_equals_hashcode.repository.EntityWithBusinessKeyRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate

@SpringBootApplication
class KotlinHibernateEqualsHashcodeApplication(val entityWithBusinessKeyRepository: EntityWithBusinessKeyRepository) :
    CommandLineRunner {
    override fun run(vararg args: String?) {
        val entity = EntityWithBusinessKey(
            date = LocalDate.now(),
            message = "Hello",
            businessKey = "12345"
        )
        println(entityWithBusinessKeyRepository.save(entity))
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinHibernateEqualsHashcodeApplication>(*args)
}
