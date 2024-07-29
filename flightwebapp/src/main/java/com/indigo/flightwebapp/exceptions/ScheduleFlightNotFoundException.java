package com.indigo.flightwebapp.exceptions;

public class ScheduleFlightNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ScheduleFlightNotFoundException(String str) {
		super(str);
	}
}
