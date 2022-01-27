package com.springbootkafkaproducerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springbootkafkaproducerexample.config.UserConfiguration;
import com.springbootkafkaproducerexample.service.UserService;

@SpringBootApplication
@ComponentScan({ "com.springbootkafkaproducerexample" })
public class SpringBootKafkaProducerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaProducerExampleApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfiguration.class);
		UserService userService = ctx.getBean(UserService.class);
		userService.printObject();
		userService.printAddress();

		SpringBootKafkaProducerExampleApplication object = new SpringBootKafkaProducerExampleApplication();
		// object.invokerUserObject();

	}

}
