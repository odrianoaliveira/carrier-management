package com.goeuro.air.partner.iatacodeorg.model

import java.util.HashMap
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("ip", "geo", "connection", "device", "agent", "karma")
class Client {

    @JsonProperty("ip")
    var ip: String? = null
    @JsonProperty("geo")
    var geo: Geo? = null
    @JsonProperty("connection")
    var connection: Connection? = null
    @JsonProperty("device")
    var device: Device? = null
    @JsonProperty("agent")
    var agent: Agent? = null
    @JsonProperty("karma")
    var karma: Karma? = null
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
