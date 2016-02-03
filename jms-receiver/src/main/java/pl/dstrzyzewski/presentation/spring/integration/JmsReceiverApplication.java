package pl.dstrzyzewski.presentation.spring.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@ImportResource("classpath:config.xml")
@EnableJms
public class JmsReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsReceiverApplication.class, args);
	}
}
