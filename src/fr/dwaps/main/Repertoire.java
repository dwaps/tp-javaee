package fr.dwaps.main;

import java.util.ArrayList;
import java.util.List;

public class Repertoire {
	private String name;
	private List<Contact> contacts;
	
	public Repertoire(String n) {
		contacts = new ArrayList<>();
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}
	
	public void addContact(Contact c) {
		this.contacts.add(c);
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}
