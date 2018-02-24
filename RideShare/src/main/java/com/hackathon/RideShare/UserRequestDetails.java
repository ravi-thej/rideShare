package com.hackathon.RideShare;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Class UserRequestDetails.
 */
@Document(collection="bookshare")
public class UserRequestDetails {
	
	@Id
	private String UserId; 
	
	private String source;
	
	private String dest;
	
	private String numOfSeats;
	
	private String type;

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(String numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
