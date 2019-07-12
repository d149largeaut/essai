package fr.eni.cours.bo;

import java.io.Serializable;

/**
 * JavaBean Voiture
 * @author tl
 * @modification ajout d'un modele (membres)
 *
 */
public class Voiture implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//attributs
	private String marque;
	private String modele; 

	//constructeurs
	public Voiture() {
	}

	//autres methodes
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + "]";
	}
	
	//accesseurs et mutateurs
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	
}
