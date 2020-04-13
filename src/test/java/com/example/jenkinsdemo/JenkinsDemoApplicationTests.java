package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class JenkinsDemoApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    public void failTest() {
        Assert.isTrue(false);

    }



}
