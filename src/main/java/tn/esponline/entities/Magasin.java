package tn.esponline.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Magasin implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String adresse;
	@OneToMany(mappedBy = "magasin")
	private List<Rayon> listMarques;
	public Magasin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Magasin(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<Rayon> getListMarques() {
		return listMarques;
	}
	public void setListMarques(List<Rayon> listMarques) {
		this.listMarques = listMarques;
	}
	
	

}
