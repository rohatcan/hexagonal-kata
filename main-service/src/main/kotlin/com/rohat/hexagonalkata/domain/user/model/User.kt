package com.rohat.hexagonalkata.domain.user.model

import java.util.*

data class User(
    val id: UUID? = null,
    val name: String,
    val email: String,
    var password: String,
)

