package gun3odev3.dataAccess;

import gun3odev3.entities.Category;

public interface CategoryDao {
	
	void add(Category category);
	Category findByName(String categoryName);

}
