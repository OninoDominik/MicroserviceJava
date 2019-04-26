package fr.CCI.Java.boulangermicroservice.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.CCI.Java.boulangermicroservice.dao.ProduitDAO;
import fr.CCI.Java.boulangermicroservice.model.Produit;

@Controller
public class ProduitVueController {

	@Autowired
	private ProduitDAO produitDao;
	
	@RequestMapping("/")
	public String accueil(Model model) { // model est un paramettre envoyé lors de l'appel de la fonction. Il permet de transférer des informations vers la vue (équivalent de la requette dans servlet?)
		
		List<Produit> produits = produitDao.findAll();
		
		model.addAttribute("produits", produits);
		
		return "Accueil";  // on utilise thymeleaf -> retourne al page Accueil.html du dossier ressources
	}
}
