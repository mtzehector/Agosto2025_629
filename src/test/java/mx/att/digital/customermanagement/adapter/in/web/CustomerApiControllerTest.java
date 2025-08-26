package mx.att.digital.customermanagement.adapter.in.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import mx.att.digital.customermanagement.adapter.in.web.delegate.CustomerApiDelegate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@WebFluxTest(controllers = CustomerApiController.class)
class CustomerApiControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @SuppressWarnings("removal")
	@MockBean
    private CustomerApiDelegate customerApiDelegate;

    @Test
    void contextLoads() {
        assertNotNull(webTestClient);
        assertNotNull(customerApiDelegate);
    }
}