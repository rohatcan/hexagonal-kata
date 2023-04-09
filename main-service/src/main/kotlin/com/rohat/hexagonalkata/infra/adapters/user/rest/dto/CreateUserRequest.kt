package com.rohat.hexagonalkata.infra.adapters.user.rest.dto

data class CreateUserRequest(
    val name: String,
    val email: String,
    val password: String,
)
