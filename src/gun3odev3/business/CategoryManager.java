package gun3odev3.business;

import gun3odev3.core.logging.Logger;
import gun3odev3.dataAccess.CategoryDao;
import gun3odev3.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
			if(categoryDao.findByName(category.getName()) != null) {
				throw new Exception("Kategori ismi tekrar edemez.");
		}
			
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
		
	}

}
