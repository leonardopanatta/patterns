package net.panatta.patterns.antipatterns.basebean;

import java.util.HashMap;

public class ContactBookAsBaseBean extends HashMap<String, String>{

	/**
	 * Serial ID.
	 */
	private static final long serialVersionUID = 4025439433413589724L;

	public void addContact(String name, String phone) {
		put(name, phone);
	}
	
	public static void main(String[] args) {
		ContactBookAsBaseBean contactBookAsBaseBean = new ContactBookAsBaseBean();
		contactBookAsBaseBean.addContact("Leonardo Panatta", "9999-9999");
		
		System.out.println(contactBookAsBaseBean.toString());
	}
}
