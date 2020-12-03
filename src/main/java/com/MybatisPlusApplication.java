package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class MybatisPlusApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MybatisPlusApplication.class, args);
	}

}
