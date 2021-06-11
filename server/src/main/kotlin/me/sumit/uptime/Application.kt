package me.sumit.uptime

import com.zaxxer.hikari.HikariDataSource
import io.ktor.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import me.sumit.uptime.plugins.*
import org.jooq.DSLContext


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module(testing: Boolean = false): ModuleContext {
    val moduleContext = configureMigration()
    configureRouting(moduleContext)
    configureSecurity()
    configureHTTP()
    configureMonitoring()
    configureSerialization()

    return moduleContext
}

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {

    }.start(wait = true)
}



data class ModuleContext(
    val dataSource: HikariDataSource,
    val dslContext: DSLContext
)
