package com.goeuro.air.carrier.carriermanagement.service

import com.goeuro.air.carrier.carriermanagement.config.CarriersConfig
import com.goeuro.air.carrier.carriermanagement.domain.Carrier
import com.goeuro.air.carrier.carriermanagement.infrastructure.persistence.CarrierRepository
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class CarrierService(private val carriersConfig: CarriersConfig,
                     private val repository: CarrierRepository) {

    fun findByIATACode(iataCode: String): Carrier? {
        return repository.findByIataCodesIn(iataCode).firstOrNull()
    }

    fun retrieveAll(): Iterable<Carrier> {
        return repository.findAll()
    }

    fun load() {
        carriersConfig.carriers.forEach { carrier -> repository.save(carrier) }
    }

    fun deleteAll() {
        repository.deleteAll()
    }

}