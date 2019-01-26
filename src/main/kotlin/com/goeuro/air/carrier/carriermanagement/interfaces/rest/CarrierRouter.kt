package com.goeuro.air.carrier.carriermanagement.interfaces.rest

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router

@Component
class CarrierRouter(private val handler: CarrierHandler) {

    @Bean
    fun router() = router {
        GET("/carriers") {
            handler.fetchAll()
        }

        GET("/carrier/{code}") {
            handler.fetchById(it)
        }

        DELETE("/carriers"){
            handler.deleteALl()
        }

        POST("/carriers/load") {
            handler.load()
        }
    }

}
