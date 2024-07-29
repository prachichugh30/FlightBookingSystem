
package com.indigo.flightwebapp.model;
import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value="passengerss")
@NoArgsConstructor
@Data
@Getter
@Setter
@AllArgsConstructor
public class passengers{
	@MongoId
private BigInteger pnrNumber;
	private String passengerName;
	private int passengerAge;
	private BigInteger passengerUIN;
	private Double luggage;
}