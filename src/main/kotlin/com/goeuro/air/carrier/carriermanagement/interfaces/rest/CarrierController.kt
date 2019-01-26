package com.goeuro.air.carrier.carriermanagement.interfaces.rest

import com.goeuro.air.carrier.carriermanagement.service.CarrierService
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Component
class CarrierController(private val service: CarrierService) {

    @Bean
    fun router() = router {
        GET("/carrier") {
            val carrier = service.findbyIATACode("U2")

            if (carrier == null) {
                ServerResponse.notFound().build()
            } else {
                ServerResponse.ok().body(fromObject(carrier))
            }

        }
    }

}