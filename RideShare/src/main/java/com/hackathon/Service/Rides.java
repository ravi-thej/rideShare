package com.ravi.prac;

import java.util.Comparator;
import java.util.List;

public class Rides {
	
	
	public Integer waitingTime;
	
	public GEOLocation currentGEOLocation;
	
	public List<GEOLocation> rideLocations;
	
	public String cabID;
	
	public Integer getWaitingTime() {
		return waitingTime;
	}


	public void setWaitingTime(Integer waitingTime) {
		this.waitingTime = waitingTime;
	}


	public GEOLocation getCurrentGEOLocation() {
		return currentGEOLocation;
	}


	public void setCurrentGEOLocation(GEOLocation currentGEOLocation) {
		this.currentGEOLocation = currentGEOLocation;
	}


	public List<GEOLocation> getRideLocations() {
		return rideLocations;
	}


	public void setRideLocations(List<GEOLocation> rideLocations) {
		this.rideLocations = rideLocations;
	}


	public String getCabID() {
		return cabID;
	}


	public void setCabID(String cabID) {
		this.cabID = cabID;
	}


	public String getPassengerID() {
		return passengerID;
	}


	public void setPassengerID(String passengerID) {
		this.passengerID = passengerID;
	}


	public String getDriverID() {
		return driverID;
	}


	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}


	public static Comparator<Rides> getWaitTimeComparator() {
		return WaitTimeComparator;
	}


	public static void setWaitTimeComparator(Comparator<Rides> waitTimeComparator) {
		WaitTimeComparator = waitTimeComparator;
	}


	public String passengerID;
	
	public String driverID;
	
	
	/**
     * Comparator to sort Rides list in order of WaitTime
     */
    public static Comparator<Rides> WaitTimeComparator = new Comparator<Rides>() {

        @Override
        public int compare(Rides r1, Rides r2) {
            return (int) (r1.getWaitingTime() - r2.getWaitingTime());
        }
    };
    
}
