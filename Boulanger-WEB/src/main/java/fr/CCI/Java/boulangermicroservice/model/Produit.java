package fr.CCI.Java.boulangermicroservice.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="seq", initialValue=10, allocationSize=100)
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id; 
	@Column(unique=true)
	private String nom;
	private int valeur;
	private String img;
	
	
	public Produit() {
	}
	
	
	public Produit(int id,String nom, int valeur, String img) {
		super();
		this.id = id;
		this.nom = nom;
		this.valeur = valeur;
		this.img = img;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return id+ " " + nom + " vendu à " + valeur + " euro";
	}
	
	

	
}
