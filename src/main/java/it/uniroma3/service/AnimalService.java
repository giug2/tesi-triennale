package it.uniroma3.service;

import java.util.List;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.uniroma3.model.Animal;
import it.uniroma3.repository.AnimalRepository;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;

	
	
	public Animal findByImage(String image) {
		return animalRepository.findByImage(image);
	}

	@Transactional
	public void save(Animal animal) {
		animalRepository.save(animal);
	}
	
	public List<Animal> findAll() {
		return (List<Animal>) animalRepository.findAll();
	}
}
