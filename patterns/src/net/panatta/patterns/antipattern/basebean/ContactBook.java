package net.panatta.patterns.antipattern.basebean;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {

	private HashMap<String, String> contacts;

	public ContactBook() {
		this.contacts = new HashMap<String, String>();
	}

	public void addContact(String name, String phone) {
		contacts.put(name, phone);
	}

	public HashMap<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(HashMap<String, String> contacts) {
		this.contacts = contacts;
	}
	
	public static void main(String[] args) {
		ContactBook contactBook = new ContactBook();
		contactBook.addContact("Leonardo Panatta", "9999-9999");
		
		Map<String, String> contacts = contactBook.getContacts();
		
		System.out.println(contacts.toString());
	}
}
