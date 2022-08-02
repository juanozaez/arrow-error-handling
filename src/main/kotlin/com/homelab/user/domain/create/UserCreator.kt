package com.homelab.user.domain.create

import com.homelab.user.domain.User
import com.homelab.user.domain.UserRepository

class UserCreator(private val repository: UserRepository) {

    fun create(user: User) {
        repository.save(user)
    }
}