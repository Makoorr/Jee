package tn.esponline.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rayon implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Enumerated(EnumType.STRING)
	private Categorie categorie;
	@Temporal(TemporalType.DATE)
	private Date dateMiseAJour;
	@ManyToOne
	private Magasin magasin;
	@ManyToMany
	private List<Fournisseur> fournisseurs;
	public Rayon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rayon( Categorie categorie) {
		super();
		
		this.categorie = categorie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Magasin getMagasin() {
		return magasin;
	}
	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	public List<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}
	public void setFournisseurs(List<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}
	
}
