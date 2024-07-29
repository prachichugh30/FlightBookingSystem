package com.indigo.flightwebapp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indigo.flightwebapp.model.Airport;

public interface AirportDao extends MongoRepository<Airport,String> {

}
