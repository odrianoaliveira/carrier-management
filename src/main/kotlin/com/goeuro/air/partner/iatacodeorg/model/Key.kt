package com.goeuro.air.partner.iatacodeorg.model

import java.util.HashMap
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("id", "api_key", "type", "trial_price", "expired", "registered", "limits_by_hour", "limits_by_minute", "demo_methods", "usage_by_hour", "usage_by_minute")
class Key {

    @JsonProperty("id")
    var id: Int? = null
    @JsonProperty("api_key")
    var apiKey: String? = null
    @JsonProperty("type")
    var type: String? = null
    @JsonProperty("trial_price")
    var trialPrice: Any? = null
    @JsonProperty("expired")
    var expired: Any? = null
    @JsonProperty("registered")
    var registered: String? = null
    @JsonProperty("limits_by_hour")
    var limitsByHour: Int? = null
    @JsonProperty("limits_by_minute")
    var limitsByMinute: Int? = null
    @JsonProperty("demo_methods")
    var demoMethods: List<Any>? = null
    @JsonProperty("usage_by_hour")
    var usageByHour: Int? = null
    @JsonProperty("usage_by_minute")
    var usageByMinute: Int? = null
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
