package com.optum.springBoot;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication app = new SpringApplication(DashBoard.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "9091"));
        app.run(args);
	}

}
