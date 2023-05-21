package tn.esponline.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ref;
	
	@ManyToMany(mappedBy = "fournisseurs")
	private List<Rayon> rayons;
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fournisseur(String ref) {
		super();
		this.ref = ref;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	public List<Rayon> getRayons() {
		return rayons;
	}
	public void setRayons(List<Rayon> rayons) {
		this.rayons = rayons;
	}
	
	
	
}
