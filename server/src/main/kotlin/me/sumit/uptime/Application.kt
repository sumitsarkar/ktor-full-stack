package me.sumit.uptime

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import me.sumit.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureHTTP()
        configureMonitoring()
        configureSerialization()
    }.start(wait = true)
}
