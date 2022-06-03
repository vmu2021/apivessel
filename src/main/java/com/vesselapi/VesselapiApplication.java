package com.vesselapi;

import com.vesselapi.rest.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ConfiguracionRest.class)
public class VesselapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VesselapiApplication.class, args);
	}

}
