package com.tosan;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class DockerChallengeApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder app = new SpringApplicationBuilder(DockerChallengeApplication.class)
                .web(WebApplicationType.SERVLET);
        app.run();
    }
}
