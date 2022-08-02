package com.homelab.user.domain

interface UserRepository {

    fun find(id: String): User?
    fun save(user: User)
}