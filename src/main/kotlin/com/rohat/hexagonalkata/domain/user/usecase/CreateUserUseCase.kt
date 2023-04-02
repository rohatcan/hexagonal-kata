package com.rohat.hexagonalkata.domain.user.usecase

import com.rohat.hexagonalkata.domain.user.model.User

interface CreateUserUseCase{

    fun createUser(user: User): User
}
