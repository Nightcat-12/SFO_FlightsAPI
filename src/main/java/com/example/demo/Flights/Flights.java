package com.example.demo.Flights;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Flight-number")

public class Flights {
    @Id
    @Column(name = "aircraftID", unique = true)
    private Integer flightNumber;
    private String tailNumber;
    private String model;
    private String airline;
    private String status;
    private Date createDate; //Day that catches attention

    public Flights(Integer num) {
        Integer FlightNumber = num;

    }

    public Flights(Integer flightNumber, String tailNumber, String model, String airline, String status) {
        this.flightNumber = flightNumber;
        this.tailNumber = tailNumber;
        this.model = model;
        this.airline = airline;
        this.status = status;
        this.createDate = new Date();
    }

    public Flights() {

    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public String getModel() {
        return model;
    }

    public String getAirline() {
        return airline;
    }

    public String getStatus() {
        return status;
    }
}
