package com.cahya.springlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LoggingTest {
    @Test
    void testLog() {
        log.info("Belajar Java");
        log.warn("Belajar Spring");
        log.error("Belajar Programmer Zaman Now");
    }
}
