package com.indigo.flightwebapp.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import com.indigo.flightwebapp.model.booking;

public interface BookingService {
	public ResponseEntity<?> createBooking(booking newBooking);

	public booking updateBooking(booking newBooking);

	public String deleteBooking(BigInteger bookingId);

	public Iterable<booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(BigInteger bookingId);
}


