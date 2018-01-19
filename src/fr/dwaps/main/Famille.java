package fr.dwaps.main;

import java.util.ArrayList;
import java.util.List;

public class Famille {
	private String name;
	private List<Personne> membres = new ArrayList<>();
	
	public Famille() {}
	public Famille(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Personne> getMembres() {
		return membres;
	}
	
	public void addMembre(Personne p) {
		membres.add(p);
	}

	public void setMembres(List<Personne> membres) {
		this.membres = membres;
	}
}
