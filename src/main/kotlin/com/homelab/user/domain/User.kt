package com.homelab.user.domain

@kotlinx.serialization.Serializable
data class User(val id: String, val name: String, val surname: String)
