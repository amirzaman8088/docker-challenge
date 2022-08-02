package com.tosan.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * @author AmirHossein ZamanZade
 * @since 8/1/2022
 */
@Configuration
@Order(1)
public class PlaceholderConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocalOverride(true);
        configurer.setLocations(getResources());
        configurer.setIgnoreResourceNotFound(true);
        configurer.setFileEncoding("UTF-8");
        return configurer;
    }

    private static Resource[] getResources() {
        return new Resource[] {
            new ClassPathResource("/config/application.properties"),
            new FileSystemResource("config/application.properties")
        };
    }
}
