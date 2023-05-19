package com.brigelabz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AddressBook {
	//ArrayList<String> contactList = new ArrayList<>();
	
	public Contact addContacts() {
		
		Contact contactObj = new Contact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter contact details");
		System.out.println("Enter name ");
		contactObj.setName(sc.next());
		System.out.println("Enter lastName ");
		contactObj.setSurName(sc.next());
		System.out.println("Enter Address ");
		contactObj.setAddress(sc.next());
		System.out.println("Enter city ");
		contactObj.setCity(sc.next());
		System.out.println("Enter state ");
		contactObj.setState(sc.next());
		System.out.println("Enter zip ");
		contactObj.setZip(sc.next());
		System.out.println("Enter moNumber ");
		contactObj.setContactNumber(sc.next());
		System.out.println("Enter email ");
		contactObj.setGmail(sc.next());
		return contactObj;
		
	}

//	@Override
//	public String toString() {
//        return "AddressBook{" +
//                "contactList=" + contactList +
//                '}';
//    }
	
	
}
