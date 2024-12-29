package org.archi.core.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI coreServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Core Service API")
                        .description("Rest API endpoints for Core Service")
                        .version("v1.0"));
    }
}
