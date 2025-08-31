package com.example.demo.Flights;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;


@Component
public class FlightService {
    private final FlightsRepo flightsRepo;

    @Autowired
    public FlightService(FlightsRepo flightsRepo) {
        this.flightsRepo = flightsRepo;
    }

    public List<Flights>  getAllFlights() {
        return flightsRepo.findAll();
    }

    public List<Flights> getFlightsByAirline(String airline) {
        List<Flights> allFlights = flightsRepo.findAll();
        List<Flights> result = new ArrayList<>();

        for (Flights flight : allFlights) {
            if (airline.equals(flight.getAirline())) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flights> findById(Integer flightNumber) {
        List<Flights> allFlights = flightsRepo.findAll();
        List<Flights> result = new ArrayList<> ();

        for (Flights flight : allFlights) {
            if (flightNumber.equals(flight.getFlightNumber())) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flights> getModel(String flightModel) {
         return flightsRepo.findAll().stream().filter(flights -> flights.getModel().toLowerCase()
                 .contains(flightModel.toLowerCase()))
                 .collect(Collectors.toList());
    }

    @Transactional
    public void deleteFlight(Integer flightNumber) {
        flightsRepo.deleteById(flightNumber);
    }

}
