package tn.esponline.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esponline.entities.Magasin;

@Repository
public interface IMagasinRepository extends CrudRepository<Magasin, Integer> {

}
