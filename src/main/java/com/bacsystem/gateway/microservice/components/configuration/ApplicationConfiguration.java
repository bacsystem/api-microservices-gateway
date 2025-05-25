package com.bacsystem.gateway.microservice.components.configuration;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

/**
 * <b>ApplicationConfiguration</b>
 * <p>
 * This class specifies the requirements for the {@link ApplicationConfiguration} component,
 * developed in accordance with the development standards established by christian.
 * Collaboration is encouraged for the enhancement and expansion of the api-microservices-gateway.
 * </p>
 * <p>
 * <b>Description:</b>
 * </p>Here!</p>
 *
 * @author christian
 * @author dbacilio88@outlook.es
 * @since 24/05/2025
 */

@Log4j2
@Configuration
@EnableWebFlux
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude = {
        WebMvcAutoConfiguration.class,
})
public class ApplicationConfiguration implements WebFluxConfigurer {
}
