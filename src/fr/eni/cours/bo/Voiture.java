package fr.eni.cours.bo;

import java.io.Serializable;

/**
 * JavaBean Voiture
 * @author tlargeau
 * @modification ajout du kilometrage
 *
 */
public class Voiture implements Serializable{
	
	private static final long serialVersionUID = 1L;

	//attributs
	private String marque;
	private int kilometrage;

	//constructeurs
	public Voiture() {
	}

	public Voiture(String marque, int kilometrage) {
		setMarque(marque);
		setKilometrage(kilometrage);
	}

	//autres methodes
	@Override
	public String toString() {
		return "Voiture [marque=" + getMarque() + ", kilometrage=" + getKilometrage() + "]";
	}

	//accesseurs et mutateurs
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	
}
