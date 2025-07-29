package it.uniroma3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Animal {

	public static final String DIR_FOLDER_IMG = "document/profili/";

    @Id
    private String image;
    private String animalType;
    private String label;
   
    
    
    public Animal(){
    }

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
