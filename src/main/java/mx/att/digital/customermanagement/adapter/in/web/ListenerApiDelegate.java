package mx.att.digital.customermanagement.adapter.in.web;

import jakarta.annotation.Generated;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerAttributeValueChangeEvent;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerCreateEvent;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerDeleteEvent;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerStateChangeEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * A delegate to be called by the {@link ListenerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public interface ListenerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /listener/customerAttributeValueChangeEvent : Client listener for entity CustomerAttributeValueChangeEvent
     * Example of a client listener for receiving the notification CustomerAttributeValueChangeEvent
     *
     * @param customerAttributeValueChangeEvent Customer attributeValueChange Event payload (required)
     * @return Notified (status code 204)
     *         or Error (status code 200)
     * @see ListenerApi#customerAttributeValueChangeEvent
     */
    default Mono<ResponseEntity<Void>> customerAttributeValueChangeEvent(Mono<CustomerAttributeValueChangeEvent> customerAttributeValueChangeEvent,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(customerAttributeValueChangeEvent).then(Mono.empty());

    }

    /**
     * POST /listener/customerCreateEvent : Client listener for entity CustomerCreateEvent
     * Example of a client listener for receiving the notification CustomerCreateEvent
     *
     * @param customerCreateEvent Customer create Event payload (required)
     * @return Notified (status code 204)
     *         or Error (status code 200)
     * @see ListenerApi#customerCreateEvent
     */
    default Mono<ResponseEntity<Void>> customerCreateEvent(Mono<CustomerCreateEvent> customerCreateEvent,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(customerCreateEvent).then(Mono.empty());

    }

    /**
     * POST /listener/customerDeleteEvent : Client listener for entity CustomerDeleteEvent
     * Example of a client listener for receiving the notification CustomerDeleteEvent
     *
     * @param customerDeleteEvent Customer delete Event payload (required)
     * @return Notified (status code 204)
     *         or Error (status code 200)
     * @see ListenerApi#customerDeleteEvent
     */
    default Mono<ResponseEntity<Void>> customerDeleteEvent(Mono<CustomerDeleteEvent> customerDeleteEvent,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(customerDeleteEvent).then(Mono.empty());

    }

    /**
     * POST /listener/customerStateChangeEvent : Client listener for entity CustomerStateChangeEvent
     * Example of a client listener for receiving the notification CustomerStateChangeEvent
     *
     * @param customerStateChangeEvent Customer stateChange Event payload (required)
     * @return Notified (status code 204)
     *         or Error (status code 200)
     * @see ListenerApi#customerStateChangeEvent
     */
    default Mono<ResponseEntity<Void>> customerStateChangeEvent(Mono<CustomerStateChangeEvent> customerStateChangeEvent,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(customerStateChangeEvent).then(Mono.empty());

    }

}
