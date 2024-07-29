package com.indigo.flightwebapp.model;

import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value="airport")
@NoArgsConstructor
@Data
@Getter
@Setter
@AllArgsConstructor
public class Airport {
	@MongoId
	private String airportCode;
private String airportLocation;
private String airportName;

}
