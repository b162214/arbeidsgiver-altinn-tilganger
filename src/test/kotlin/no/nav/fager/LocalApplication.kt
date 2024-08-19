package no.nav.fager

import io.ktor.server.cio.CIO
import io.ktor.server.engine.embeddedServer

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0", module = {
        ktorConfig(mockOauth2ServerConfig)
    })
        .start(wait = true)
}