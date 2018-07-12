package com.netlify.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;


@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.netlify" })
@SpringBootApplication
public class ApplicationLauncher extends AsyncConfigurerSupport {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationLauncher.class, args);
	}
}
