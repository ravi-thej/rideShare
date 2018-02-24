package com.ravi.prac;

public class User {
	
	public GEOLocation sourceGeoLocation;
	
	public String Name;
	
	public GEOLocation getSourceGeoLocation() {
		return sourceGeoLocation;
	}

	public void setSourceGeoLocation(GEOLocation sourceGeoLocation) {
		this.sourceGeoLocation = sourceGeoLocation;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String ID;

}
