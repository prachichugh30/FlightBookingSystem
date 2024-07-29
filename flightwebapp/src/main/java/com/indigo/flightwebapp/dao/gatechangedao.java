package com.indigo.flightwebapp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indigo.flightwebapp.model.Flight;

public interface gatechangedao extends MongoRepository<GateChange,String>{

}
