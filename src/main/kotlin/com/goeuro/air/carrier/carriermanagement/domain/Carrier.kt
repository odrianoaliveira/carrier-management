package com.goeuro.air.carrier.carriermanagement.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.net.URL

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

class Contact {
    lateinit var phoneNumber: String
    lateinit var website: String
}

class TermAndConditions {
    lateinit var label: String
    lateinit var urls: Map<String, URL>
}

enum class PassengerCategory { ADULT, CHILD, INFANT }

class AgeRange {
    val start = PeriodWrapper()
    val end = PeriodWrapper()
}

class PeriodWrapper {
    var value: String? = null
    var unit: String? = null
}
