package com.spring.Model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Event {
	private int id;  
	private String eventName;  
	private String eventOrganiserName;  
	private String onDay;
	private int eventFare;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String geteventName() {
		return eventName;
	}
	public void seteventName(String eventName) {
		this.eventName = eventName;
	}
	public String geteventOrganiserName() {
		return eventOrganiserName;
	}
	public void seteventOrganiserName(String eventOrganiserName) {
		this.eventOrganiserName= eventOrganiserName;
	}
	public String getonDay() {
		return onDay;
	}
	
	public void setonDay(String date)  {
		this.onDay=date;
	}
	public int geteventFare() {
		return eventFare;
	}
	public void seteventFare(int eventFare) {
		this.eventFare = eventFare;
	}
	  

}