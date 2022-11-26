package gun3odev3.dataAccess;

import java.util.ArrayList;
import java.util.List;

import gun3odev3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	private List<Category> categories = new ArrayList<>();

	public void add(Category category) {
		categories.add(category);
		System.out.println(category.getName() + " Hibernate ile veritabanına eklendi.");
	}

	@Override
	public Category findByName(String categoryName) {
			for (Category category : categories) {
				if (category.getName() == categoryName) {
					return category;
				}
			}
		return null;
	}

}
