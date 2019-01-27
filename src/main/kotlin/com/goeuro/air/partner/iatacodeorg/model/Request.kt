package com.goeuro.air.partner.iatacodeorg.model

import java.util.HashMap
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("lang", "currency", "time", "id", "server", "host", "pid", "key", "params", "version", "method", "client")
class Request {

    @JsonProperty("lang")
    var lang: String? = null
    @JsonProperty("currency")
    var currency: String? = null
    @JsonProperty("time")
    var time: Int? = null
    @JsonProperty("id")
    var id: Int? = null
    @JsonProperty("server")
    var server: String? = null
    @JsonProperty("host")
    var host: String? = null
    @JsonProperty("pid")
    var pid: Int? = null
    @JsonProperty("key")
    var key: Key? = null
    @JsonProperty("params")
    var params: Params? = null
    @JsonProperty("version")
    var version: Int? = null
    @JsonProperty("method")
    var method: String? = null
    @JsonProperty("client")
    var client: Client? = null
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
