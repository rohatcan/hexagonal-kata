package com.rohat.hexagonalkata.domain.user

import com.rohat.hexagonalkata.domain.user.model.User
import com.rohat.hexagonalkata.domain.user.port.UserPersistencePort
import com.rohat.hexagonalkata.domain.user.usecase.CreateUserUseCase
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userPersistencePort: UserPersistencePort,
    private val passwordEncoder: BCryptPasswordEncoder,
) : CreateUserUseCase {
    override fun createUser(user: User): User {
        // validate input
        // do checks
        user.password = passwordEncoder.encode(user.password)

        return userPersistencePort.save(user)
    }


}