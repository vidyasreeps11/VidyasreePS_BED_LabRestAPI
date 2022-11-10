package com.gl.lab6.FestDebateRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FestDebateRegistrationApplication extends SpringBootServletInitializer{

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(FestDebateRegistrationApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FestDebateRegistrationApplication.class, args);
	}

}
