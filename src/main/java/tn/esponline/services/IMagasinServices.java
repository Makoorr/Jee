package tn.esponline.services;

import java.util.Date;
import java.util.List;

import tn.esponline.entities.Categorie;
import tn.esponline.entities.Fournisseur;
import tn.esponline.entities.Magasin;
import tn.esponline.entities.Rayon;

public interface IMagasinServices {
	
	public Magasin addMagasin(Magasin magasin);
	public Rayon addRayon(Rayon rayon);
	public void affecterRayonMagasin( int idR, int idM);
	public void affecterRayonFournisseur(Fournisseur fournisseur, int idR);
	public List<Rayon> getRayons(Categorie categorie, Date date);
}
