package com.manzanoCorp.gestion_de_productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})


public class GestionDeProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDeProductosApplication.class, args);
	}

}
