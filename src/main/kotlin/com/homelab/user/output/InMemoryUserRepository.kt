package com.homelab.user.output

import com.homelab.user.domain.User
import com.homelab.user.domain.UserRepository

class InMemoryUserRepository : UserRepository {
    private val map = mutableMapOf<String, User>()

    override fun find(id: String): User? {
        return map[id]
    }

    override fun save(user: User) {
        map[user.id] = user
    }
}