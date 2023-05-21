package tn.esponline.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esponline.entities.Categorie;
import tn.esponline.entities.Fournisseur;
import tn.esponline.entities.Magasin;
import tn.esponline.entities.Rayon;
import tn.esponline.repository.IFournisseurRepository;
import tn.esponline.repository.IMagasinRepository;
import tn.esponline.repository.IRayonRepository;

@Service
public class MagasinServices implements IMagasinServices {
	@Autowired
	IFournisseurRepository fournrep;
	@Autowired
	IMagasinRepository magrep;
	@Autowired
	IRayonRepository rayrep;
	@Override
	public Magasin addMagasin(Magasin magasin) {
		// TODO Auto-generated method stub
		return magrep.save(magasin);
	}
	@Override
	public Rayon addRayon(Rayon rayon) {
		// TODO Auto-generated method stub
		return rayrep.save(rayon);
	}
	@Override
	public void affecterRayonMagasin(int idR, int idM) {
		Magasin magasin = magrep.findById(idM).get();
		Rayon rayon= rayrep.findById(idR).get();
		rayon.setMagasin(magasin);
		rayrep.save(rayon);
		
	}
	@Override
	public void affecterRayonFournisseur(Fournisseur fournisseur, int idR) {
		Rayon rayon=rayrep.findById(idR).get();
		rayon.getFournisseurs().add(fournisseur);
		fournrep.save(fournisseur);
		
	}
	@Override
	public List<Rayon> getRayons(Categorie categorie, Date date) {
		// TODO Auto-generated method stub
		return rayrep.getRayons(categorie, date);
	}

}
