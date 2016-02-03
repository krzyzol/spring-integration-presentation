package pl.dstrzyzewski.presentation.spring.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadNameService {

    private static final Logger LOG = LoggerFactory.getLogger(ThreadNameService.class);

    public void write(final String data) {
        final String threadName = Thread.currentThread().getName();
        LOG.info("Data received: {}, Thread name: {}", data, threadName);
    }

}
