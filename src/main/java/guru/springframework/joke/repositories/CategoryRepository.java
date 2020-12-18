package guru.springframework.joke.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.joke.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

	Optional<Category>findByDescription(String description);
}
