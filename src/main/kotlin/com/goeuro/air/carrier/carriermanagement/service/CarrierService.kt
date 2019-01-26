package com.goeuro.air.carrier.carriermanagement.service

import com.goeuro.air.carrier.carriermanagement.config.CarriersConfig
import com.goeuro.air.carrier.carriermanagement.infrastructure.persistence.CarrierRepository
import com.goeuro.air.carrier.carriermanagement.domain.Carrier
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class CarrierService(private val carriersConfig: CarriersConfig,
                     private val repository: CarrierRepository) {

    @PostConstruct
    fun init() {
        carriersConfig.carriers.forEach { carrier -> repository.save(carrier) }
    }

    fun findbyIATACode(iataCode: String): Carrier? {
        return repository.findByIataCodesIn(iataCode).first()
    }

}