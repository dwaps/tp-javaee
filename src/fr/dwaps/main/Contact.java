package fr.dwaps.main;

public class Contact extends Object {
	private String nom;
	private int age;
	
	public Contact() {}
	public Contact(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public void setNom(String n) { this.nom = n; }
	public String getNom() { return nom; }
	public int getAge() { return age; }
	
	@Override
	public String toString() {
		return "objet Contact : " + super.toString();
	}
}
