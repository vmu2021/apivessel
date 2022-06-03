package com.vesselapi;

import com.vesselapi.rest.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/jpa-config.xml"})
=======
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ConfiguracionRest.class)
>>>>>>> c5800c1b77ebde6f053859b0e04dd124ed9e523c
public class VesselapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VesselapiApplication.class, args);
	}
}
