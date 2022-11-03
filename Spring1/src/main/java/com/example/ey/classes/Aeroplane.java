package com.example.ey.classes;

import org.springframework.stereotype.Component;

// @Component will be added to inform the Application class that 
// object of this class can be created
@Component

public class Aeroplane {

	 private int flightId;
		private String flightType;
	 public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public Aeroplane() {
		this.flightId = 3;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	 
	public String fly() {
		return "FlightId" +flightId+ "is running";
		
	}
	 

	 
	 
}
