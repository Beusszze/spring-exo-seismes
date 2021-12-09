package fr.m2i.exercice_seismes.repositories;

import fr.m2i.exercice_seismes.entities.Pays;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends MongoRepository<Pays, String> {
}
