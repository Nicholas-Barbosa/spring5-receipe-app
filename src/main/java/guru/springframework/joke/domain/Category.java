package guru.springframework.joke.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Category extends BaseEntity{

	private String description;
	
	@ManyToMany(mappedBy = "categories")
	private Set<Recipe>recipes;

	
	public Category(String description, Set<Recipe> recipes) {
		super();
		this.description = description;
		this.recipes = recipes;
	}

	public String getDescription() {
		return description;
	}

	public Set<Recipe> getRecipes() {
		return recipes;
	}
	
	
}
