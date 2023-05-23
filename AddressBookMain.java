package com.brigelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
	 static HashMap<String,AddressBook> addressBookMap=new HashMap<>();
	 static HashMap<String, ArrayList<Contact>> addressBookNames = new HashMap<String, ArrayList<Contact>>();

	public static void main(String[] args) {
		
		AddressBook addressBook = new AddressBook();

		System.out.println("Welcome in AddressBook system Program");
		
		Scanner scanner = new Scanner(System.in);
		
		int operation;
		
		do {
			System.out.println("1. ADD CONTACT" + " \n2. DISPLAY CONTACT " + "\n3 EDIT " + "+\n4 Delete "
					+ "\n5 Display Address Books " + "\n6 New Address Book" + "\n7. EXIT ");

			System.out.println("Enter the Operation Number");
			operation = scanner.nextInt();
			
			switch (operation) {
			case 1:
				scanner.nextLine();
				if (addressBookNames.isEmpty()) {
					System.out.println("Creating your New Address Book ");
					System.out.println("Enter a address book Name");
					String name3 = scanner.nextLine();
					addressBookNames.put(name3, addressBook.crateNewAddressBook());

				}
				System.out.println("your Address Book Names");
				for (String addressBookName : addressBookNames.keySet()) {
					System.out.println(addressBookName);
				}
				System.out.println("Choice one upper address Book name");
				String name = scanner.nextLine();
				addressBookNames.put(name, addressBook.addContacts(addressBookNames.get(name)));
				break;
				
			case 2:
				System.out.println(addressBookMap);
				break;
				
			case 3:
				addressBook.editContact();
				break;
				
			case 4:
				addressBook.deleteContact();
				break;
				
			case 5:
				if (addressBookNames.isEmpty()) {
					System.out.println("Address Book is empty !");
				}
				System.out.println("Choice your Address Book Name you want to print ");
				for (String add : addressBookNames.keySet()) {
					System.out.println(addressBookNames);
				}

				break;
			case 6:
				System.out.println("Enter a address book Name");
				scanner.nextLine();
				String name2 = scanner.nextLine();
				addressBookNames.put(name2, addressBook.crateNewAddressBook());
				break;
			case 7:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Enter The Correct Operation Number");

			}
		}
		while (operation != 7);
		addressBook.createAddressBook(addressBook);
	}

}
