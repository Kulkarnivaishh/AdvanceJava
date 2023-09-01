package com.kiranacademy.warCurrentUR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class WarCurrentUrApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarCurrentUrApplication.class, args);
	}
}

