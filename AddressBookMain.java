package com.brigelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		
	        System.out.println("Welcome in AddressBook system");
	        System.out.println("WelCome To AddressBook Program");
	        Scanner scanner = new Scanner(System.in);
	        int operation;
	        do {
	            System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACT \n3 EDIT \n4 Delete \n5. EXIT ");
	            System.out.println("Enter the Operation Number");
	            operation = scanner.nextInt();
	            switch (operation) {
	                case 1:
	                	addressBook.addContacts();;
	                    break;
	                case 2:
	                    System.out.println(addressBook);
	                    break;
	                case 3:
	                	addressBook.editContact();
	                    break;
	                case 4:
	                	addressBook.deleteContact();
	                    break;
	                case 5:
	                    System.out.println("Exiting");
	                    break;
	                default:
	                    System.out.println("Enter The Wrong Opration Number");
	            }
	        } while (operation != 5);
	    }

}
