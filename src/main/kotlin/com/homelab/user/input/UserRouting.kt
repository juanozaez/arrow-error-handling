package com.homelab.user.input

import com.homelab.user.domain.find.UserFinder
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

val finder = UserFinder()

fun Route.userRouting() {
    route("/users") {
        get("{id?}") {
            val id = call.parameters["id"] ?: return@get call.respondText(
                "Missing id", status = HttpStatusCode.BadRequest
            )

            finder.find("2").also { call.respond(it.toString()) }
        }
    }
}