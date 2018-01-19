package fr.dwaps.main;

public class Pere extends Personne {
	
	public Pere() {}
	public Pere(String firstname) {
		super(firstname);
	}
	
	@Override
	public String toString() {
		return "Le père s'appelle " + getFirstname();
	}
}
