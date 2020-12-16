package guru.springframework.joke.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity 
public class Recipe extends BaseEntity{

	private String description;
	private Integer prepTime;
	private Integer cookTime;
	private Integer servings;
	private String source;
	private String url;
	private String directions;
	@Lob
	private Byte[] image;
	@OneToOne(cascade = CascadeType.ALL)
	private Notes notes;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "recipe")
	private Set<Ingredient>ingredients;
	
	public Recipe(String description, Integer prepTime, Integer cookTime, Integer servings, String source, String url,
			String directions, Byte[] image, Notes notes) {
		super();
		this.description = description;
		this.prepTime = prepTime;
		this.cookTime = cookTime;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.directions = directions;
		this.image = image;
		this.notes = notes;
	}

	public String getDescription() {
		return description;
	}

	public Integer getPrepTime() {
		return prepTime;
	}

	public Integer getCookTime() {
		return cookTime;
	}

	public Integer getServings() {
		return servings;
	}

	public String getSource() {
		return source;
	}

	public String getUrl() {
		return url;
	}

	public String getDirections() {
		return directions;
	}

	public Byte[] getImage() {
		return image;
	}

	public Notes getNotes() {
		return notes;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
