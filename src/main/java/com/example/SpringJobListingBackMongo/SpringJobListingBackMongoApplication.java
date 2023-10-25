package com.example.SpringJobListingBackMongo;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJobListingBackMongoApplication {

	@Bean
	@Hidden
	public OpenAPI usersMicroserviceOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Your API Title")
						.description("Your API Description")
						.version("1.0"));
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringJobListingBackMongoApplication.class, args);
	}
}
