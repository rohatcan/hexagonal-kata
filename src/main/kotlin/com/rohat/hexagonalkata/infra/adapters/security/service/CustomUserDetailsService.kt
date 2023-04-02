package com.rohat.hexagonalkata.infra.adapters.security.service

import com.rohat.hexagonalkata.infra.adapters.security.dto.CustomUserDetails
import com.rohat.hexagonalkata.infra.adapters.user.mongo.repository.UserMongoRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService(
    private val repository: UserMongoRepository,
) : UserDetailsService{
    override fun loadUserByUsername(username: String?): UserDetails {
        val user = repository.findByName(username)
        return CustomUserDetails(user)
    }
}