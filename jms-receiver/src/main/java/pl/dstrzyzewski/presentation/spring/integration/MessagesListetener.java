package pl.dstrzyzewski.presentation.spring.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessagesListetener {

    private static final Logger LOG = LoggerFactory.getLogger(MessagesListetener.class);

    @JmsListener(destination = "demo-messages")
    public void handle(final String message) {
        LOG.info("Received message: {}", message);
    }

}
