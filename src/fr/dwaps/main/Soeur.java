package fr.dwaps.main;

public class Soeur extends Enfant {
	
	public Soeur() {}
	public Soeur(String firstname) {
		super(firstname);
	}
	
	@Override
	public String toString() {
		return "La soeur s'appelle " + getFirstname();
	}
}
