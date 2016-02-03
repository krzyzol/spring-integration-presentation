package pl.dstrzyzewski.presentation.spring.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestingDemoApplication.class)
public class TestingDemoApplicationTests {

    @Autowired
    private MessagingTemplate messagingTemplate;

    @Autowired
    private MessageChannel testChannel;

    @Test
    public void shouldUpperCaseMessageStartingWithA() {
        final String response = messagingTemplate.convertSendAndReceive(testChannel, "aCd", String.class);
        assertThat(response).isEqualTo("ACD");
    }

    @Test
    public void shouldLowerCaseMessageStartingWithNotA() {
        final String response = messagingTemplate.convertSendAndReceive(testChannel, "bCD", String.class);
        assertThat(response).isEqualTo("bcd");
    }

}
