package com.movn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@PropertySources({@PropertySource(value={"classpath:movn.properties"})})
public class MovnApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovnApplication.class, args);
	}

}
