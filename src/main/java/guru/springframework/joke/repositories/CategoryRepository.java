package guru.springframework.joke.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.joke.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
