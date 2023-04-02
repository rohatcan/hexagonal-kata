package com.rohat.hexagonalkata.infra.adapters.user.mongo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document
data class UserEntity(
    @Id
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val email: String,
    val password: String,
)
