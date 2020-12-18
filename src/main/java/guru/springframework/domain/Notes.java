package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Notes extends BaseEntity {

	@OneToOne
	private Recipe recipe;
	@Lob
	private String recipeNotes;

	public Notes(Recipe recipe, String recipeNotes) {
		super();
		this.recipe = recipe;
		this.recipeNotes = recipeNotes;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public String getRecipeNotes() {
		return recipeNotes;
	}

}
