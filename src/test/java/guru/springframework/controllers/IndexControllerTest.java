package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class IndexControllerTest {

	@Mock
	Model model;

	@Mock
	IndexController indexController;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
		model.addAttribute("1Z0-819", "PASSED");
	}

	@Test
	public void test() {
		System.out.println("IndexPage " + indexController.getClass());
		var map = model.asMap();
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		assertEquals(map.size(), 0);

	}

}
