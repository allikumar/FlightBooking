package com.project.flight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication

@EnableEurekaClient
@OpenAPIDefinition(info=@Info(title="Booking Management API",version="1.0",description="An API used for Flight Booking"))
public class BookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}
}
	



