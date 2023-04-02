package com.rohat.hexagonalkata.infra.adapters.user.mongo

import com.rohat.hexagonalkata.domain.user.model.User
import com.rohat.hexagonalkata.domain.user.port.UserPersistencePort
import com.rohat.hexagonalkata.infra.adapters.user.mongo.entity.UserEntity
import com.rohat.hexagonalkata.infra.adapters.user.mongo.repository.UserMongoRepository
import org.springframework.stereotype.Service

@Service
class UserMongoAdapter(
    private val userMongoRepository: UserMongoRepository
) : UserPersistencePort {
    override fun save(user: User): User {
        return userMongoRepository.save(user.toEntity()).toModel()
    }
}

fun User.toEntity(): UserEntity {
    return UserEntity(
        name = this.name,
        email = this.email,
        password = this.password,
    )
}

fun UserEntity.toModel(): User {
    return User(
        name = this.name,
        email = this.email,
        password = this.password,
    )
}