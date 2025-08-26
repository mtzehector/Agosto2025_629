package mx.att.digital.customermanagement.infrastructure;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Carga JSON de mocks desde classpath de forma reactiva.
 */
@Component
public class MockResourceLoader {

    private final ObjectMapper mapper;

    public MockResourceLoader(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * Lee el contenido bruto de un archivo bajo resources (p.ej. "mocks/customer/getCustomerById.json").
     */
    public Mono<String> loadRaw(String path) {
        return Mono.fromCallable(() -> {
                ClassPathResource res = new ClassPathResource(path);
                byte[] data = res.getInputStream().readAllBytes();
                return new String(data, StandardCharsets.UTF_8);
            })
            .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * Lee y parsea a un objeto T.
     */
    public <T> Mono<T> loadAs(String path, Class<T> clazz) {
        return loadRaw(path)
            .map(json -> {
                try {
                    return mapper.readValue(json, clazz);
                } catch (IOException e) {
                    throw new RuntimeException("Error parseando JSON a " + clazz.getSimpleName(), e);
                }
            });
    }

    /**
     * Lee y parsea a una lista de T.
     */
    public <T> Flux<T> loadList(String path, TypeReference<List<T>> typeRef) {
        return loadRaw(path)
            .flatMapIterable(json -> {
                try {
                    return mapper.readValue(json, typeRef);
                } catch (IOException e) {
                    throw new RuntimeException("Error parseando JSON a List<" + typeRef.getType() + ">", e);
                }
            });
    }
}
