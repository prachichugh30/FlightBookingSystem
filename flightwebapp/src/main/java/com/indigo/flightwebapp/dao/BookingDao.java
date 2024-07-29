package com.indigo.flightwebapp.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indigo.flightwebapp.model.booking;

public interface BookingDao extends  MongoRepository<booking,BigInteger> {

}
