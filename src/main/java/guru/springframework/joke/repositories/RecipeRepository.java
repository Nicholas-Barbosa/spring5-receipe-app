package guru.springframework.joke.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.joke.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
