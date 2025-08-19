package com.example.demo.Flights;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightsRepo extends JpaRepository<Flights, Integer> {

    void deleteById(Integer flightID);// find a flight by their ID and delete it
    Optional<Flights> findById(Integer flightID); //solve cases where players cannot be found in Repo

    //void addFlight(Flights flights);

    //void updateFlight(Flights flights);

}
