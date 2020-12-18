package guru.springframework.joke.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.joke.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

	Optional<UnitOfMeasure> findByDescription(String description);

}
