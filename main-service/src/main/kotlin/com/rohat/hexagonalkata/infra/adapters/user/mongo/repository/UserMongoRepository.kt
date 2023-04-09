package com.rohat.hexagonalkata.infra.adapters.user.mongo.repository

import com.rohat.hexagonalkata.infra.adapters.user.mongo.entity.UserEntity
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.UUID

interface UserMongoRepository : MongoRepository<UserEntity, UUID>{
    fun findByName(username: String?): UserEntity

}