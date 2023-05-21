package tn.esponline.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esponline.entities.Categorie;
import tn.esponline.entities.Fournisseur;
import tn.esponline.entities.Magasin;
import tn.esponline.entities.Rayon;
import tn.esponline.services.IMagasinServices;

@RestController
public class MagasinController {
	
	@Autowired
	IMagasinServices services;
	
	@PostMapping("/addMagasin")
	public Magasin saveMagasin(@RequestBody Magasin magasin) {
		return services.addMagasin(magasin);
	}
	
	@PostMapping("/addRayon")
	public Rayon saveRayon(@RequestBody Rayon rayon) {
		return services.addRayon(rayon);
	}

	@PutMapping("/affecterRayMag/{idR}/{idM}")
	public void  affecterRayonMag(@PathVariable("idR") int idR,@PathVariable("idM") int idM )
	{
		services.affecterRayonMagasin(idR, idM);
	}
	@PostMapping("/ajoutaffecterRayFour/{idR}")
	public void  affecterRayonFour(@PathVariable("idR") int idR,@RequestBody Fournisseur fournisseur)
	{
		services.affecterRayonFournisseur(fournisseur, idR);
	}
	@GetMapping("/getRayon/{categorie}/{date}")
	public void  getRayons(@PathVariable("categorie") Categorie categorie,@PathVariable("Date") Date date)
	{
		services.getRayons(categorie, date);
	}
	
	
}
