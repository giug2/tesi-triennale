package it.uniroma3.controller.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import it.uniroma3.model.Animal;

@Component
public class AnimalValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Animal.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
	}
}
