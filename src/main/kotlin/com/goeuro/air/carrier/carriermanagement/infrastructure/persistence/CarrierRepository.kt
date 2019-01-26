package com.goeuro.air.carrier.carriermanagement.infrastructure.persistence

import com.goeuro.air.carrier.carriermanagement.domain.Carrier
import org.springframework.data.repository.CrudRepository

interface CarrierRepository : CrudRepository<Carrier, String>{
    fun findByIataCodesIn(iataCode: String): List<Carrier>
}

