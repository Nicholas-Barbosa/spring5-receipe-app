package guru.springframework.joke.domain;

import javax.persistence.Entity;

@Entity
public class UnitOfMeasure extends BaseEntity {

	private String description;

	public UnitOfMeasure() {
		// TODO Auto-generated constructor stub
	}

	public UnitOfMeasure(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "UnitOfMeasure [description=" + description + "]";
	}

}
