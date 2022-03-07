package br.com.dio.model;

import java.io.Serializable;

public class Event implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String organization;
	private String locale;
	private String date;
	private String timetable;
	
	public Event() {
		
	}
	
	public Event(String name, String organization, String locale, String date, String timetable) {
		super();
		this.name = name;
		this.organization = organization;
		this.locale = locale;
		this.date = date;
		this.timetable = timetable;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTimetable() {
		return timetable;
	}
	public void setTimetable(String timetable) {
		this.timetable = timetable;
	}
	
}
