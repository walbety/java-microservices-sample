package com.walbety.micros.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages = {"com.walbety.micros.app"})
//@ComponentScan(basePackages = "com.walbety.micros")
public class MicrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosApplication.class, args);
	}

}
