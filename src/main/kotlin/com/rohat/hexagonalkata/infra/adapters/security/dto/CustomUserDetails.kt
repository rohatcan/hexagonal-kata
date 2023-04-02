package com.rohat.hexagonalkata.infra.adapters.security.dto

import com.rohat.hexagonalkata.infra.adapters.user.mongo.entity.UserEntity
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class CustomUserDetails private constructor(
    private val name:String,
    private val password: String,
    private val authorities: MutableList<GrantedAuthority>
): UserDetails {

    constructor(user: UserEntity) : this(user.name, user.password, mutableListOf()) {

    }

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return authorities
    }

    override fun getPassword(): String {
        return password
    }

    override fun getUsername(): String {
        return name
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}
