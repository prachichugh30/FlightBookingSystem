package com.indigo.flightwebapp.model;

import org.springframework.data.mongodb.core.mapping.MongoId;

public class GateChangeUpdate {
	@MongoId
private String flightId;
private String status;
private String oldGate;
private String newGate;

public GateChangeUpdate(String flightId, String status, String oldGate, String newGate) {
    this.flightId = flightId;
    this.status = status;
    this.oldGate = oldGate;
    this.newGate = newGate;
}

public String getFlightId() {
    return flightId;
}

public String getStatus() {
    return status;
}

public String getOldGate() {
    return oldGate;
}

public String getNewGate() {
    return newGate;
}
}


