package com.bahaida.springplayground;

import com.bahaida.untracked.UntrackedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bahaida.untracked", "com.bahaida.springplayground"})
@ImportResource("classpath:untracked-config.xml")
public class SpringPlaygroundApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringPlaygroundApplication.class);

	private UntrackedService service;

	public SpringPlaygroundApplication(UntrackedService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringPlaygroundApplication.class, args);

	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			logger.info(service.sayHello());
		};
	}
}

