package com.indigo.flightwebapp.service;

public class NotificationService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@KafkaListener(topics="notificationTopic")
	public void handleNotification(FlightModified flightmodified) {
		log.info("receieved notification for FLIGHTCHANGE-{}",Flightmodified.getFlightNo());
	}

}
