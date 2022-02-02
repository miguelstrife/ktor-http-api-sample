package com.jetbrains.handson.httpapi

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.routing.*
import io.ktor.serialization.*
import routes.customerRouting
import routes.registerOrderRoutes


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    this.registerCustomerRoutes()
}

fun Application.registerCustomerRoutes() {
    routing {
        customerRouting()
        registerOrderRoutes()
    }
}
