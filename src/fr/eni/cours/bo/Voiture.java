package fr.eni.cours.bo;

public class Voiture {
	private String marque;

	public Voiture() {
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + "]";
	}
	
	
}
