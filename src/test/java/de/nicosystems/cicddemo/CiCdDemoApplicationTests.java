package de.nicosystems.cicddemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CiCdDemoApplicationTests {

    @Test
    void contextLoads() {
        assertThat(1).isEqualTo(0);
    }

}
