package fr.dwaps.main;

public class Mere extends Personne {
	
	public Mere() {}
	public Mere(String firstname) {
		super(firstname);
	}
	
	@Override
	public String toString() {
		return "La mère s'appelle " + getFirstname();
	}
}
