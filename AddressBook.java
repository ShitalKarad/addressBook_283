package com.brigelabz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AddressBook {
	ArrayList<Contact> contactList = new ArrayList<>();

	public void addContacts() {

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
		contactList.add(contactObj);

	}
	@Override
	 public String toString() {
	        return "contactList: " + contactList +
	                '}';
	    }

	public void editContact() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name:");
		String name = sc.next();
		for (Contact contactObj : contactList) {
			if (name.equals(contactObj.getName())) {
				System.out.println("What you want to edit for the contact");
				System.out.println("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip Code\n7."
						+ "Mobile Number\n8.Email id");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the First Name :");
					contactObj.setName(sc.next());
					break;
				case 2:
					System.out.println("Enter the Last Name :");
					contactObj.setSurName(sc.next());
					break;
				case 3:
					System.out.println("Enter the Address :");
					contactObj.setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter the City :");
					contactObj.setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter the State :");
					contactObj.setState(sc.next());
					break;
				case 6:
					System.out.println("Enter the Zip code :");
					contactObj.setZip(sc.next());
					break;
				case 7:
					System.out.println("Enter the Mobile Number :");
					contactObj.setContactNumber(sc.next());
					break;
				}
			}
		}
	}
	
	 public void deleteContact() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first name:");
	        String name = sc.next();
	        for (Contact contactObj : contactList) {
	            if (name.equals(contactObj.getName())) {
	                contactList.remove(contactObj);
	                break;
	            }
	        }
	    }
}
