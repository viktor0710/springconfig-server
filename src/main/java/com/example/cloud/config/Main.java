package com.example.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Main {

	public static void main(String[] arguments) {
		SpringApplication.run(Main.class, arguments);
	}
}
