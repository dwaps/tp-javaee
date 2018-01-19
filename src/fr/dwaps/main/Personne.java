package fr.dwaps.main;

public abstract class Personne {
	private String firstname;

	public Personne() {}
	public Personne(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}
