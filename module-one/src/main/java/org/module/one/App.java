package org.module.one;

import org.module.two.service.TwoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("org.module.one,org.module.two.service")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}
	
/*	@Bean
	public TwoService getTwoService(){
		return new TwoService();
	}*/
}
