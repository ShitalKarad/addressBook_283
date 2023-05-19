package com.brigelabz;

import java.util.Objects;

public class Contact {

	private String name ;
    private String surName;
    private String address;
    private String  city ;
    private String state;
    private String contactNumber;
    private String zip;
    private String gmail ;
    
    
	public Contact(String name, String surName, String address, String city, String state, String contactNumber,
			String zip, String gmail) {
		super();
		this.name = name;
		this.surName = surName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.contactNumber = contactNumber;
		this.zip = zip;
		this.gmail = gmail;
	}
	
	public Contact() {
		
	}
	
	@Override
	public String toString() {
		return "name:" +" "+ name + "\n surName:" +" "+ surName + "\n address:" +" "+ address + "\n city:" + " "+city + "\n state:"
				+ " "+state + "\n contactNumber:" + contactNumber + "\n zip:" +" "+ zip + "\n gmail:" +" "+ gmail ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
    
    
}
