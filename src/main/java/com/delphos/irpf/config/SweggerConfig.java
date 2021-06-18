package com.delphos.irpf.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SweggerConfig {
	@Bean
    public Docket clientetApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.delphos.irpf"))
                .paths(PathSelectors.regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "IRPF API REST ",
                "API REST Calculadora de Imposto de Renda.",
                "1.0",
                "Terms of Service",
                new Contact("Pablo Gonzalez", "https://www.youtube.com/channel/UCP7qVGLMEBNktzaiVQXOBkg",
                        "pablojava853@ooutlook.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}
