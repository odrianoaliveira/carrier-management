package com.goeuro.air.carrier.carriermanagement.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Carrier {
    @Id
    var id: String? = null
    lateinit var displayName: String
    var iataCodes: List<String>? = null
    val contact = Contact()
    val termAndConditions = TermAndConditions()
    lateinit var passengerAgeCategories: Map<PassengerCategory, AgeRange>
}
