package com.prod.onoff;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@AllArgsConstructor
public class OnoffApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnoffApplication.class, args);
    }

}
