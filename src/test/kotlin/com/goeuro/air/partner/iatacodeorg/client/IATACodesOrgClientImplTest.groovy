package com.goeuro.air.partner.iatacodeorg.client

import com.goeuro.air.carrier.carriermanagement.CarrierManagementApplication
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification
import spock.lang.Unroll

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = CarrierManagementApplication.class)
@RunWith(SpringRunner.class)
@Unroll
class IATACodesOrgClientTest extends Specification {

    @Autowired
    private IATACodesOrgClient client

    def "fetch the airlines"() {
        given:
        def key = "8d75f1c0-a8b4-42d0-934c-82086a3b1bf2"

        when:
        def airlines = client.getAirlines(key)

        then:
        airlines != null
    }
}
