package com.springautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springautowire.config.UserConfiguration;
import com.springautowire.service.UserService;

@SpringBootApplication
@ComponentScan({ "com.springautowire" })
public class SpringAutowire implements CommandLineRunner
{

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringAutowire.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfiguration.class);
		//UserService userService = ctx.getBean(UserService.class);
		//userService.printObject();
		//userService.printAddress();

		SpringAutowire object = new SpringAutowire();
		// object.invokerUserObject();

	}

	@Override
	public void run(String... args) throws Exception {
		userService.printAddress();
		userService.printObject();

	}
}
