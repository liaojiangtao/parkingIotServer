package com.fangle.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ParkingIotServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingIotServerApplication.class, args);
    }

}
