package com.example.leduyduoc_examp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LeDuyDuocExampApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeDuyDuocExampApplication.class, args);
	}
}
