package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.annotation.PostConstruct;

import java.util.TimeZone;


@SpringBootApplication
@EnableAsync
@CrossOrigin(origins = "*")
public class Application {

   @PostConstruct
    public void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Bogota"));
    }

	public static void main(String[ ]  args) {
		SpringApplication.run(Application.class, args);
	}
}
