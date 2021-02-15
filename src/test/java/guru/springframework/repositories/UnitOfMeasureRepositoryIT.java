package guru.springframework.repositories;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.domain.UnitOfMeasure;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

	@Autowired
	UnitOfMeasureRepository unRepository;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	//@DirtiesContext
	public void findByDescription() {
		Optional<UnitOfMeasure> unOptional = unRepository.findByDescription("Teaspoon");
		unOptional.ifPresent(x -> System.out.println("achou!"));
	}

	@Test
	public void findByDescriptionCup() {
		Optional<UnitOfMeasure> unOptional = unRepository.findByDescription("Cup");
		unOptional.ifPresent(x -> System.out.println("Cup!"));
	}

}
