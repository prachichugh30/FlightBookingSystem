package com.indigo.flightwebapp.Controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
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
import com.indigo.flightwebapp.model.booking;
import com.indigo.flightwebapp.service.BookingService;



@CrossOrigin("http://localhost:4200")
@ComponentScan(basePackages = "com")
@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired(required= true)
	BookingService bookingService;

	@PostMapping("/createBooking")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addBooking(@RequestBody booking newBooking) {

		bookingService.createBooking(newBooking);
	}

	@GetMapping("/readAllBooking")
	public Iterable<booking> readAllBookings() {

		return bookingService.displayAllBooking();
	}

	@PutMapping("/updateBooking")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyBooking(@RequestBody booking updateBooking) {

		bookingService.updateBooking(updateBooking);
	}

	@GetMapping("/searchBooking/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> searchBookingByID(@PathVariable("id") BigInteger bookingId) {

		return bookingService.findBookingById(bookingId);
	}

	@DeleteMapping("/deleteBooking/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void deleteBookingByID(@PathVariable("id") BigInteger bookingId) {

		bookingService.deleteBooking(bookingId);
	}
}