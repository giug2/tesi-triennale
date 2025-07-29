package it.uniroma3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import it.uniroma3.service.AnimalService;

@Controller
public class GeneralController {
	
	@Autowired
	private AnimalService animalService;

	
	
	@GetMapping(value = "/") 
	public String home(Model model) {
		model.addAttribute("animals", this.animalService.findAll());
		return "index";
	}
}
