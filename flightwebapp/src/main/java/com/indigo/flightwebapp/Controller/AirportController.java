package com.indigo.flightwebapp.Controller;
import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indigo.flightwebapp.exceptions.RecordAlreadyPresentException;
import com.indigo.flightwebapp.exceptions.RecordNotFoundException;
import com.indigo.flightwebapp.model.Airport;
import com.indigo.flightwebapp.service.AirportService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/airport")
public class AirportController {
	@Autowired(required = true)
	AirportService airportService;

	@GetMapping("/viewAirport/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public Airport viewAirport(@PathVariable("id") String airportCode) {
		return airportService.viewAirport(airportCode);
	}

	@GetMapping("/allAirport")
	public Iterable<Airport> viewAllAirport() {
		return airportService.viewAllAirport();
	}

	@PostMapping("/addAirport")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addAirport(@RequestBody Airport airport) {
		airportService.addAirport(airport);
	}

	@PutMapping("/updateAirport")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyAirport(@RequestBody Airport airport) {
		airportService.modifyAirport(airport);
	}

	@DeleteMapping("/deleteAirport/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void removeAirport(@PathVariable("id") String airportCode) {
		airportService.removeAirport(airportCode);
	}
}

