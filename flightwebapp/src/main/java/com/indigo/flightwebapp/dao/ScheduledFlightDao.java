package com.indigo.flightwebapp.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indigo.flightwebapp.model.ScheduledFlight;

public interface ScheduledFlightDao extends MongoRepository<ScheduledFlight,BigInteger> {

}
