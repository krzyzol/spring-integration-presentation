package pl.dstrzyzewski.presentation.spring.integration;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class AmazingService {

    @ServiceActivator(inputChannel = "testChannel")
    public String transform(final String message) {
        if (message.startsWith("A") || message.startsWith("a")) {
            return message.toUpperCase();
        } else {
            return message.toLowerCase();
        }
    }

}
