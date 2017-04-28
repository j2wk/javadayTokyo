package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="/resource")
public class JavaDayTokyoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JavaDayTokyoApplication.class, args);
	}
}
