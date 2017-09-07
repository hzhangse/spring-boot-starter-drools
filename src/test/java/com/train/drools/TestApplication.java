package com.train.drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.train.drools.configuration.DroolsAutoConfiguration;

@Configuration
@EnableAutoConfiguration
@Import(DroolsAutoConfiguration.class)
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
