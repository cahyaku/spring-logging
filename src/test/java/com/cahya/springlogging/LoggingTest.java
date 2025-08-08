package com.cahya.springlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Slf4j
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {

    @Test
    void testLongLogging() {
        for (int i = 0; i < 100_000; i++) {
            log.warn("Hello World{}", i);
        }
    }

    @Test
    void testLog() {
        /**
         * log info tidak akan muncul di console
         * karena level log di application-test.properties adalah warn
         * dimana level warn lebih tinggi dari info
         */
        log.info("Belajar Java");
        log.warn("Belajar Spring");
        log.error("Belajar Programmer Zaman Now");
    }
}
