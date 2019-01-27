package com.goeuro.air.carrier.carriermanagement.domain

import org.springframework.data.annotation.Id

class Holding {
    @Id
    var id: String? = null
    var companyName: String? = null
}