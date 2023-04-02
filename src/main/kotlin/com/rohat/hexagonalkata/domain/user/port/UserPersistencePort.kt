package com.rohat.hexagonalkata.domain.user.port

import com.rohat.hexagonalkata.domain.user.model.User

interface UserPersistencePort {

    fun save(user: User): User
}