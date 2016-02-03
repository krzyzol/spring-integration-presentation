package pl.dstrzyzewski.presentation.spring.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:si-config.xml")
public class PublishSubscribeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublishSubscribeApplication.class, args);
	}
}
