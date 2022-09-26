package com.ettas.reds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RedsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedsApplication.class, args);
	}

}
