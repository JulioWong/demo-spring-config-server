package com.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoSpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringConfigServerApplication.class, args);
	}

}
