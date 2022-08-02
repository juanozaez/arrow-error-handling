package com.homelab.plugins

import com.homelab.user.input.userRouting
import io.ktor.server.application.Application
import io.ktor.server.routing.routing

fun Application.configureRouting() {

    routing {
        userRouting()
    }
}
