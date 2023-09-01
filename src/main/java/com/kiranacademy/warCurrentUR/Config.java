package com.kiranacademy.warCurrentUR;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration//part of spring
public class Config {
	@Bean//method level annotation
	A createObjectOfA() {
		System.err.println("I am in been anotation");
		A  aaa=new A();
		return aaa;
	}
	

}