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
	public int hashCode() {
		return Objects.hash(address, city, contactNumber, gmail, name, state, surName, zip);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(gmail, other.gmail)
				&& Objects.equals(name, other.name) && Objects.equals(state, other.state)
				&& Objects.equals(surName, other.surName) && Objects.equals(zip, other.zip);
	}


	@Override
	public String toString() {
		return "Contact [name=" + name + ", surName=" + surName + ", address=" + address + ", city=" + city + ", state="
				+ state + ", contactNumber=" + contactNumber + ", zip=" + zip + ", gmail=" + gmail + "]";
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
