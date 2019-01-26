package com.goeuro.air.carrier.carriermanagement

import com.goeuro.air.carrier.carriermanagement.config.CarriersConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@EnableConfigurationProperties
@SpringBootApplication
class CarrierManagementApplication(@Autowired val config: CarriersConfig)

fun main(args: Array<String>) {
    runApplication<CarrierManagementApplication>(*args)
}

