package com.indigo.flightwebapp.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.indigo.flightwebapp.dao.BookingDao;
import com.indigo.flightwebapp.exceptions.RecordAlreadyPresentException;
import com.indigo.flightwebapp.exceptions.RecordNotFoundException;
import com.indigo.flightwebapp.model.booking;

public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingDao bookingDao;
	

	@Override
	public ResponseEntity<booking> createBooking(booking newBooking) {

		Optional<booking> findBookingById = bookingDao.findById(newBooking.getBookingId());
		try {
			if (!findBookingById.isPresent()) {
				bookingDao.save(newBooking);
				return new ResponseEntity<booking>(newBooking, HttpStatus.OK);
			} else
				throw new RecordAlreadyPresentException(
						"Booking with Booking Id: " + newBooking.getBookingId() + " already exists!!");
		} catch (RecordAlreadyPresentException e) {

			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
	@Override
	public booking updateBooking(booking changedBooking) {
		Optional<booking> findBookingById = bookingDao.findById(changedBooking.getBookingId());
		if (findBookingById.isPresent()) {
			bookingDao.save(changedBooking);
		} else
			throw new RecordNotFoundException(
					"Booking with Booking Id: " + changedBooking.getBookingId() + " not exists!!");
		return changedBooking;
	}


	@Override
	public String deleteBooking(BigInteger bookingId) {

		Optional<booking> findBookingById = bookingDao.findById(bookingId);
		if (findBookingById.isPresent()) {
			bookingDao.deleteById(bookingId);
			return "Booking Deleted!!";
		} else
			throw new RecordNotFoundException("Booking not found for the entered BookingID");
	}

	@Override
	public Iterable<booking> displayAllBooking() {

		return bookingDao.findAll();
	}


	@Override
	public ResponseEntity<?> findBookingById(BigInteger bookingId) {
		Optional<booking> findById = bookingDao.findById(bookingId);
		try {
			if (findById.isPresent()) {
				booking findBooking = findById.get();
				return new ResponseEntity<booking>(findBooking, HttpStatus.OK);
			} else
				throw new RecordNotFoundException("No record found with ID " + bookingId);
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}

