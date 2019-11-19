package org.workspace7.msa.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@PropertySource("classpath:swagger.properties")
public class SwaggerConfiguration {

    @Bean
    Docket calculatorApi(){ //llama al servicio de calculadora (controller)
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) // información
                .select() //se seleccionan los paths
                .paths(PathSelectors.any())
                .build() //constructor
                .pathMapping("/"); //mapeo del path
    }

    private ApiInfo apiInfo() { //informacion personal
        return new ApiInfoBuilder()
                .title("RESTful WS Calculator")
                .description("Calculadora con operaciones basicas")
                .contact(new Contact("Gabriel Arce", "", "gabriel.arce.blanco@gmail.com"))
               .version("1.0.0")
                .build();
    }
}
