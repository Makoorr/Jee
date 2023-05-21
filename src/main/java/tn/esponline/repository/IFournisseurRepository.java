package tn.esponline.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esponline.entities.Fournisseur;

@Repository
public interface IFournisseurRepository extends CrudRepository<Fournisseur, Integer> {

}
