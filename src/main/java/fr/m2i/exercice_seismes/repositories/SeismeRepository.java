package fr.m2i.exercice_seismes.repositories;

import fr.m2i.exercice_seismes.entities.Seisme;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeismeRepository extends MongoRepository<Seisme, String> {
}
