package com.goeuro.air.partner.iatacodeorg.model

import java.util.HashMap
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("is_blocked", "is_crawler", "is_bot", "is_friend", "is_regular")
class Karma {

    @JsonProperty("is_blocked")
    var isBlocked: Boolean? = null
    @JsonProperty("is_crawler")
    var isCrawler: Boolean? = null
    @JsonProperty("is_bot")
    var isBot: Boolean? = null
    @JsonProperty("is_friend")
    var isFriend: Boolean? = null
    @JsonProperty("is_regular")
    var isRegular: Boolean? = null
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
