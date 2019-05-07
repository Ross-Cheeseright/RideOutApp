package com.twobeardedguys.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rideouts")
public class Rideout {

	private Long id;
	private String eventName;
	//private Array riders;
	//private Boolean rideoutOpen;
	private String startDate;
	private String endDate;
	//private User rideLeader;
	private Long maxRiders;
	
	@Id @GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/*public Boolean getRideoutOpen() {
		return rideoutOpen;
	}
	public void setRideoutOpen(Boolean rideoutOpen) {
		this.rideoutOpen = rideoutOpen;
	}*/
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Long getMaxRiders() {
		return maxRiders;
	}
	public void setMaxRiders(Long maxRiders) {
		this.maxRiders = maxRiders;
	}
	
	//TODO: Getter and setter for Array of users
	//TODO: Getter and setter for Ride Leader
	
	
}