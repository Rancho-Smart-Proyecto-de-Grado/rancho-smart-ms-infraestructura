package com.rancho_smart.ms_infraestructura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsInfraestructuraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsInfraestructuraApplication.class, args);
	}

}
