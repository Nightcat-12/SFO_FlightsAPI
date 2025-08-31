package com.example.demo.Flights;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class FlightConfig {
    @Bean
    CommandLineRunner commandLineRunner(FlightsRepo repository) {
        return args -> {
            Flights number = new Flights(12844);
        };
    }

}
