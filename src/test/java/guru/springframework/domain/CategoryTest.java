package guru.springframework.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	 Category category;

	@Before
	public  void setUp() {
		System.out.println("setUp!");
		category = new Category();
	}

	@Test
	public void test() {
		category.setId(4l);

		assertEquals(4, Long.parseLong(category.getId() + ""));
	}

	@Test
	public void test2() {
		category.setId(4l);
		assertEquals(4, Long.parseLong(category.getId() + ""));
	}
}
