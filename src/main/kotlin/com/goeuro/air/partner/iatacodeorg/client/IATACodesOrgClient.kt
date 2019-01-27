package com.goeuro.air.partner.iatacodeorg.client


import com.goeuro.air.partner.iatacodeorg.model.AirlineResponse
import feign.RequestLine
import org.springframework.cloud.openfeign.FeignClient

@FeignClient(value = "IATACodesOrg", url = "https://iatacodes.org")
interface IATACodesOrgClient {

    @RequestLine("GET /api/v7/airlines?api_key={apiKey}")
    fun getAirlines(apiKey: String): AirlineResponse

}
