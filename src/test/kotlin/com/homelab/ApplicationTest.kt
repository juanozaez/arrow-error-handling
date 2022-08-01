package com.homelab

import com.homelab.plugins.configureRouting
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    @Test
    fun `returns user by id`() = testApplication {
        application {
            configureRouting()
        }

        client.get("/users/2").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("""User(id=1, name=Paco, surname=Porras)""", bodyAsText())
        }
    }
}