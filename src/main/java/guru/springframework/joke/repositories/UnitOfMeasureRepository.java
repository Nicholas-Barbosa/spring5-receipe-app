package guru.springframework.joke.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.joke.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

}
