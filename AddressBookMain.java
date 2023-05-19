package com.brigelabz;

public class AddressBookMain {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.addContacts();
		System.out.println(addressBook);
		addressBook.editContact();
		System.out.println(addressBook);
	}

}
