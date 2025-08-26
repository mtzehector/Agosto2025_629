package mx.att.digital.customermanagement.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class JsonTestUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    
    static {
        // Configurar ObjectMapper para permitir comentarios
        objectMapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
    }

    public static String loadJsonFromFile(String filePath) throws IOException {
        ClassPathResource resource = new ClassPathResource(filePath);
        try (InputStream inputStream = resource.getInputStream()) {
            return StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        }
    }

    public static <T> T loadJsonFromFile(String filePath, Class<T> valueType) throws IOException {
        ClassPathResource resource = new ClassPathResource(filePath);
        try (InputStream inputStream = resource.getInputStream()) {
            return objectMapper.readValue(inputStream, valueType);
        }
    }
}