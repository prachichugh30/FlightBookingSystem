package com.indigo.flightwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.VariableOperators.Map;
import org.springframework.stereotype.Service;

import com.indigo.flightwebapp.dao.gatechangedao;
import com.indigo.flightwebapp.event.GateModified;
import com.indigo.flightwebapp.model.GateChangeUpdate;

@Service
public class GateChangeserviceimpl implements GateChangeInterface{
	  private final Map<String, GateChangeUpdate> gateChangeUpdates;
		private final KafkaTemplate<String,GateModified> kafkaTemplate;


	    public GateChangeserviceimpl() {
	        this.gateChangeUpdates = new HashMap<>();
	    }

@Autowired
gatechangedao GateChangedao
	 public void upsertGateChangeUpdate(GateChangeUpdate update) {
	        gateChangeUpdates.put(update.getFlightId(), update);
	        System.out.println("Gate change update saved/updated.");
	    }

	    public Optional<GateChangeUpdate> getGateChangeUpdate(String flightId) {
	        return Optional.ofNullable(gateChangeUpdates.get(flightId));
	    }

	    public void deleteGateChangeUpdate(String flightId) {
	        if (gateChangeUpdates.remove(flightId) != null) {
	            System.out.println("Gate change update deleted.");
	            kafkaTemplate.send("notificationTopic",new GateModified(GateChangeUpdate.getNewGate()));
	        } else {
	            System.out.println("Gate change update not found.");
	        }
	    }

	    public void listAllGateChangeUpdates() {
	        if (gateChangeUpdates.isEmpty()) {
	            System.out.println("No gate change updates available.");
	        } else {
	            gateChangeUpdates.values().forEach(System.out::println);
	        }
	    }

}
