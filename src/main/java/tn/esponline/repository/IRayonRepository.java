package tn.esponline.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esponline.entities.Categorie;
import tn.esponline.entities.Rayon;

@Repository
public interface IRayonRepository extends CrudRepository<Rayon, Integer> {
	@Query("select r from Rayon r where r.categorie =:cat and r.dateMiseAJour<:date")
	public List<Rayon> getRayons(@Param("cat") Categorie cat, @Param("date") Date date );

}
