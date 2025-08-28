package mx.att.digital.customermanagement.adapter.in.web;

import jakarta.annotation.Generated;
import mx.att.digital.customermanagement.interfaces.dto.Hub;
import mx.att.digital.customermanagement.interfaces.dto.HubFVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * A delegate to be called by the {@link HubApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public interface HubApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /hub : Create a subscription (hub) to receive Events
     * Sets the communication endpoint to receive Events.
     *
     * @param hubFVO Data containing the callback endpoint to deliver the information (required)
     * @return Notified (status code 201)
     *         or Error (status code 200)
     * @see HubApi#createHub
     */
    default Mono<ResponseEntity<Hub>> createHub(Mono<HubFVO> hubFVO,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"query\" : \"query\", \"callback\" : \"callback\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(hubFVO).then(Mono.empty());

    }

    /**
     * DELETE /hub/{id} : Remove a subscription (hub) to receive Events
     * 
     *
     * @param id Identifier of the Resource (required)
     * @return Deleted (status code 204)
     *         or Error (status code 200)
     * @see HubApi#hubDelete
     */
    default Mono<ResponseEntity<Void>> hubDelete(String id,
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
        return result.then(Mono.empty());

    }

    /**
     * GET /hub/{id} : Retrieve a subscription (hub)
     * 
     *
     * @param id Identifier of the Resource (required)
     * @return Notified (status code 200)
     *         or Error (status code 200)
     * @see HubApi#hubGet
     */
    default Mono<ResponseEntity<Hub>> hubGet(String id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"query\" : \"query\", \"callback\" : \"callback\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

}
