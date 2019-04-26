package fr.CCI.Java.boulangermicroservice.dao;

import java.util.ArrayList;
import java.util.List;

import fr.CCI.Java.boulangermicroservice.model.Produit_Old;

public class ProduitDAO_Old {

	List<Produit_Old> produits = new ArrayList<>();
	
	public ProduitDAO_Old() {
		this.produits.add(new  Produit_Old(0, "pain", 2, "url"));
		this.produits.add(new  Produit_Old(1, "tarte", 1, "url"));
		this.produits.add(new  Produit_Old(2, "paris brest", 5, "url"));
	}
	
	
	
	public void addProduit(Produit_Old p ) {
		this.produits.add(p);
	}

	public List<Produit_Old> getProduits() {
		return produits;
	}
	

	public Produit_Old getByID(int id) {
		for (Produit_Old produit : produits) {
			if(produit.getId() == id)
				return produit;
		}
		return null;
	}



	public void update(int id, Produit_Old p) {
		Produit_Old prod = getByID(id);
		
		prod.setImg(p.getImg());
		prod.setNom(p.getNom());
		prod.setValeur(p.getValeur());
		
	}
	
	
	
}
