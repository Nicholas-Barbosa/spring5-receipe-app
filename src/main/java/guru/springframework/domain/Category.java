package guru.springframework.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Category extends BaseEntity {

	private String description;

	@ManyToMany(mappedBy = "categories")
	private Set<Recipe> recipes;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String description, Set<Recipe> recipes) {
		super();
		this.description = description;
		this.recipes = recipes;

	}

}
