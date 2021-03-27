package com.ms.profilejava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.core.env.Environment;

@SpringBootApplication(
		exclude = {
				ThymeleafAutoConfiguration.class,
		})
public class ProfileJavaApplication  implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(ProfileJavaApplication.class);

	@Autowired
	public Environment env;


	public static void main(String[] args) {
		SpringApplication.run(ProfileJavaApplication.class, args);
	}

	@Override
	public void run(String... args){
		logger.info("{}", env.getProperty("JAVA_HOME"));
		logger.info("{}", env.getProperty("welcome.message"));

	}
}
