package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private final CategoryRepository categoryRepository;
	private final UnitOfMeasureRepository unitRepository;

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitRepository = unitRepository;
	}

	@RequestMapping({ "/", "", "index" })
	public String getIndexPage() {
//		categoryRepository.findByDescription("American").ifPresent(System.out::println);
//		unitRepository.findByDescription("Teaspoon").ifPresent(System.out::println);
		return "index";
	}
}
