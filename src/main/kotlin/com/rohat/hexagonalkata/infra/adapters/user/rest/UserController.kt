package com.rohat.hexagonalkata.infra.adapters.user.rest

import com.rohat.hexagonalkata.domain.user.model.User
import com.rohat.hexagonalkata.domain.user.usecase.CreateUserUseCase
import com.rohat.hexagonalkata.infra.adapters.user.rest.dto.CreateUserRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/users")
class UserController(
    private val createUserUseCase: CreateUserUseCase
){


    @PostMapping
    fun createUser(request : CreateUserRequest) {
        createUserUseCase.createUser(request.toModel())
    }

}

fun CreateUserRequest.toModel(): User {
    return User(
        name = this.name,
        email = this.email,
        password = this.password,
    )

}