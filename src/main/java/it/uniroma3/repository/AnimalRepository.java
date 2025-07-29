package it.uniroma3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import it.uniroma3.model.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {

	Animal findByImage(String image);

}
