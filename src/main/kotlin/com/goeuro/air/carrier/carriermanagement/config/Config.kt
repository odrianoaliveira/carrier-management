package com.goeuro.air.carrier.carriermanagement.config

import com.goeuro.air.carrier.carriermanagement.domain.Carrier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "metadata")
// https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-kotlin.html#boot-features-kotlin-configuration-properties
class CarriersConfig {
    lateinit var test: String
    lateinit var carriers: List<Carrier>
}
