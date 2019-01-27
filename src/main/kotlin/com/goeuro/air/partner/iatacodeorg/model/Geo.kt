package com.goeuro.air.partner.iatacodeorg.model

import java.util.HashMap
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("country_code", "country", "continent", "city", "lat", "lng", "timezone")
class Geo {

    @JsonProperty("country_code")
    var countryCode: String? = null
    @JsonProperty("country")
    var country: String? = null
    @JsonProperty("continent")
    var continent: String? = null
    @JsonProperty("city")
    var city: String? = null
    @JsonProperty("lat")
    var lat: Double? = null
    @JsonProperty("lng")
    var lng: Double? = null
    @JsonProperty("timezone")
    var timezone: String? = null
    @JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    @JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    @JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties[name] = value
    }

}
