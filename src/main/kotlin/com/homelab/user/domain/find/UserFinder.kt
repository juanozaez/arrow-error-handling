package com.homelab.user.domain.find

import com.homelab.user.domain.UserRepository

class UserFinder(private val repository: UserRepository) {
    fun find(id: String) = repository.find(id)
}