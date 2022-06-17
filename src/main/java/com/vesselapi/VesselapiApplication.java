package com.vesselapi;

import com.vesselapi.rest.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;



import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ConfiguracionPorJava.class)
@ImportResource({ "classpath:config/jpa-config.xml" })

public class VesselapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VesselapiApplication.class, args);
	}
}
