package com.goeuro.air.carrier.carriermanagement.interfaces.rest

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router

@Component
class CarrierRouter(private val handler: CarrierHandler) {

    @Bean
    fun router() = router {
        POST("/carriers/load") {
            handler.load()
        }
        GET("/carriers") {
            handler.fetchAll()
        }
        DELETE("/carriers"){
            handler.deleteALl()
        }

        GET("/carrier/{code}") {
            handler.fetchById(it)
        }

//        PUT("/carrier/{code}") {
//            handler.updateCarrier(it)
//        }
//
//        PATCH("/carrier/{code}") {
//            handler.patchById(it)
//        }
//
//        DELETE("/carrier/{code}") {
//            handler.deleteById(it)
//        }
    }

}
