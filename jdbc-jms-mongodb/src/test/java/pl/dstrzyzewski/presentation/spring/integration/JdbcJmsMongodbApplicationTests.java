package pl.dstrzyzewski.presentation.spring.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JdbcJmsMongodbApplication.class)
public class JdbcJmsMongodbApplicationTests {

	@Test
	public void contextLoads() {
	}

}
