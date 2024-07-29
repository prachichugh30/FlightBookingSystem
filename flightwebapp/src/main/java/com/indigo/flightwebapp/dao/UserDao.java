package com.indigo.flightwebapp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indigo.flightwebapp.model.Users;

public interface UserDao extends MongoRepository<Users,Integer>{

}
