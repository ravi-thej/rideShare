package com.ravi.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BookingServiceImpl {

	
	public final static double AVERAGE_RADIUS_OF_EARTH_IN_KM = 6371;
	
	// Input : RideList and rider
	public static Map<Integer, Rides> FilterRides (List<Rides> rideList, Rider rider) {
		
			//Sort Rides based on waitingTime
		Collections.sort(rideList, Rides.WaitTimeComparator);
			
			//Sort Rides based on nearness
		Map<Integer, Rides> sortedMap = sortNearness(rideList, rider);
		
		return sortedMap;
			
	}

	private static Map<Integer, Rides> sortNearness(List<Rides> rideList, Rider rider) {
		
		Map<Integer, Rides> sortedMap = new TreeMap<Integer, Rides>();
		
		for (Rides ride : rideList) {
			
			sortedMap.put(calculateDistanceInKilometer(ride, rider), ride);
			
		}
		
		return sortedMap;
		
	}
	
	public static int calculateDistanceInKilometer(Rides ride, Rider rider) {
		
		double riderLat = rider.getSourceGeoLocation().getLattitude();
		double riderLan = rider.getSourceGeoLocation().getLongitude();
		double rideLat = ride.getCurrentGEOLocation().getLattitude();
		double rideLan = ride.getCurrentGEOLocation().getLongitude();

	    double latDistance = Math.toRadians(riderLat - rideLat);
	    double lngDistance = Math.toRadians(riderLan - rideLan);

	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	      + Math.cos(Math.toRadians(riderLat)) * Math.cos(Math.toRadians(rideLat))
	      * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

	    return (int) (Math.round(AVERAGE_RADIUS_OF_EARTH_IN_KM * c));
	}
	
	
}
