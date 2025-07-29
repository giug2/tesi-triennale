package it.uniroma3.controller;

import static it.uniroma3.model.Animal.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import it.uniroma3.controller.validator.AnimalValidator;
import it.uniroma3.model.Animal;
import it.uniroma3.service.AnimalService;
import it.uniroma3.utility.FileStore;
import jakarta.validation.Valid;

@Controller
public class AnimalController {

	@Autowired
	private AnimalService animalService;
	
	@Autowired
	private AnimalValidator animalValidator;
	
	
	
	/* ===== NEW ANIMAL ===== */
	@GetMapping(value = "/formNewAnimal")
	public String formNewAnimal(Model model) {
		model.addAttribute("animal", new Animal());
		return "formNewAnimal";
	}
	
	@PostMapping("/formNewAnimal")
	public String newAnimal(@Valid @ModelAttribute("animal") Animal animal, BindingResult bindingResult,
			@RequestParam("file") MultipartFile file, 
						   Model model){
		this.animalValidator.validate(animal, bindingResult);
		if (!bindingResult.hasErrors()) {
			animal.setImage(FileStore.store(file, DIR_FOLDER_IMG));
			this.animalService.save(animal);
			return this.getAnimals(model);
		}
		return "formNewAnimal";
	}

	/* ===== ANIMAL ===== */
	@GetMapping(value="/animal/{image}")
	public String getAnimal(@PathVariable("image") String image, Model model) {
		model.addAttribute("animal", this.animalService.findByImage(image));
		return "animal";
	}
	
	/* ===== ANIMALS ===== */
	@GetMapping(value="/animals")
	public String getAnimals(Model model) {
		model.addAttribute("animals", this.animalService.findAll());
		return "elencoAnimali";
	}
}
