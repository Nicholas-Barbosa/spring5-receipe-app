package guru.springframework.joke.domain;

import javax.persistence.Entity;

@Entity
public class UnitOfMeasure extends BaseEntity {

	private String description;

	public UnitOfMeasure(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
