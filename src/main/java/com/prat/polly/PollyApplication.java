package com.prat.polly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class PollyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PollyApplication.class, args);
    }

}
