package mx.att.digital.customermanagement.adapter.in.web.delegate;

import jakarta.annotation.Generated;
import mx.att.digital.customermanagement.adapter.in.web.ApiUtil;
import mx.att.digital.customermanagement.adapter.in.web.CustomerApi;
import mx.att.digital.customermanagement.adapter.in.web.CustomerApiController;
import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerFVO;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerMVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * A delegate to be called by the {@link CustomerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public interface CustomerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customer : Creates a Customer
     * This operation creates a Customer entity.
     *
     * @param customerFVO The Customer to be created (required)
     * @param fields Comma-separated properties to be provided in response (optional)
     * @return OK/Created (status code 201)
     *         or Accepted (status code 202)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     *         or Not Implemented (status code 501)
     *         or Service Unavailable (status code 503)
     * @see CustomerApi#createCustomer
     */
    default Mono<ResponseEntity<Customer>> createCustomer(Mono<CustomerFVO> customerFVO,
        String fields,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"contactMedium\" : [ { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true }, { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true } ], \"creditProfile\" : [ { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"role\" : \"role\", \"agreement\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"relatedParty\" : [ { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"characteristic\" : [ { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"statusReason\" : \"statusReason\", \"@baseType\" : \"@baseType\", \"partyRoleSpecification\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"name\" : \"name\", \"paymentMethod\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"engagedParty\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(customerFVO).then(Mono.empty());

    }

    /**
     * DELETE /customer/{id} : Deletes a Customer
     * This operation deletes a Customer entity.
     *
     * @param id Identifier of the Resource (required)
     * @return Accepted (status code 202)
     *         or Deleted (status code 204)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     *         or Not Implemented (status code 501)
     *         or Service Unavailable (status code 503)
     * @see CustomerApi#deleteCustomer
     */
    default Mono<ResponseEntity<Void>> deleteCustomer(String id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
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

    /**
     * GET /customer : List or find Customer objects
     * List or find Customer objects
     *
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Internal Server Error (status code 500)
     *         or Not Implemented (status code 501)
     *         or Service Unavailable (status code 503)
     * @see CustomerApi#listCustomer
     */
    default Mono<ResponseEntity<Flux<Customer>>> listCustomer(String fields,
        Integer offset,
        Integer limit,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "[ { \"contactMedium\" : [ { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true }, { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true } ], \"creditProfile\" : [ { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"role\" : \"role\", \"agreement\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"relatedParty\" : [ { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"characteristic\" : [ { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"statusReason\" : \"statusReason\", \"@baseType\" : \"@baseType\", \"partyRoleSpecification\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"name\" : \"name\", \"paymentMethod\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"engagedParty\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"status\" : \"status\" }, { \"contactMedium\" : [ { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true }, { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true } ], \"creditProfile\" : [ { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"role\" : \"role\", \"agreement\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"relatedParty\" : [ { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"characteristic\" : [ { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"statusReason\" : \"statusReason\", \"@baseType\" : \"@baseType\", \"partyRoleSpecification\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"name\" : \"name\", \"paymentMethod\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"engagedParty\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"status\" : \"status\" } ]";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
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

    /**
     * PATCH /customer/{id} : Updates partially a Customer
     * This operation updates partially a Customer entity.
     *
     * @param id Identifier of the Resource (required)
     * @param customerMVO The Customer to be patched (required)
     * @param fields Comma-separated properties to be provided in response (optional)
     * @return Success (status code 200)
     *         or Accepted (status code 202)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     *         or Not Implemented (status code 501)
     *         or Service Unavailable (status code 503)
     * @see CustomerApi#patchCustomer
     */
    default Mono<ResponseEntity<Customer>> patchCustomer(String id,
        Mono<CustomerMVO> customerMVO,
        String fields,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"contactMedium\" : [ { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true }, { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true } ], \"creditProfile\" : [ { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"role\" : \"role\", \"agreement\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"relatedParty\" : [ { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"characteristic\" : [ { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"statusReason\" : \"statusReason\", \"@baseType\" : \"@baseType\", \"partyRoleSpecification\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"name\" : \"name\", \"paymentMethod\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"engagedParty\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(customerMVO).then(Mono.empty());

    }

    /**
     * GET /customer/{id} : Retrieves a Customer by ID
     * This operation retrieves a Customer entity. Attribute selection enabled for all first level attributes.
     *
     * @param id Identifier of the Resource (required)
     * @param fields Comma-separated properties to be provided in response (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Internal Server Error (status code 500)
     *         or Not Implemented (status code 501)
     *         or Service Unavailable (status code 503)
     * @see CustomerApi#retrieveCustomer
     */
    default Mono<ResponseEntity<Customer>> retrieveCustomer(String id,
        String fields,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"contactMedium\" : [ { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true }, { \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"contactType\" : \"contactType\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"preferred\" : true } ], \"creditProfile\" : [ { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"creditProfileDate\" : \"2000-01-23T04:56:07.000+00:00\", \"creditScore\" : 6, \"@baseType\" : \"@baseType\", \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"creditRiskRating\" : 0, \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"role\" : \"role\", \"agreement\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"validFor\" : { \"startDateTime\" : \"1985-04-12T23:20:50.52Z\", \"endDateTime\" : \"1985-04-12T23:20:50.52Z\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"relatedParty\" : [ { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"partyOrPartyRole\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"characteristic\" : [ { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"characteristicRelationship\" : [ { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@baseType\" : \"@baseType\", \"relationshipType\" : \"relationshipType\", \"@type\" : \"@type\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"valueType\" : \"valueType\", \"name\" : \"name\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"statusReason\" : \"statusReason\", \"@baseType\" : \"@baseType\", \"partyRoleSpecification\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"name\" : \"name\", \"paymentMethod\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\", \"engagedParty\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"href\" : \"href\", \"id\" : \"id\", \"@schemaLocation\" : \"@schemaLocation\" } ], \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"@schemaLocation\" : \"@schemaLocation\", \"message\" : \"message\", \"referenceError\" : \"referenceError\", \"status\" : \"status\" }";
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
