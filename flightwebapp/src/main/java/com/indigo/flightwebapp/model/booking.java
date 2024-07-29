package com.indigo.flightwebapp.model;

import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Document(value="Booking")
@NoArgsConstructor
@Data
@Getter
@Setter
@AllArgsConstructor
public class booking {
	@MongoId
	private BigInteger bookingId;
	private String bookingDate;
	private int noOfPassengers;

}
