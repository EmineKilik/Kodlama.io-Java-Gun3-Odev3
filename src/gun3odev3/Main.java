package gun3odev3;

import gun3odev3.business.CategoryManager;
import gun3odev3.business.CourseManager;
import gun3odev3.core.logging.DatabaseLogger;
import gun3odev3.core.logging.FileLogger;
import gun3odev3.core.logging.Logger;
import gun3odev3.dataAccess.HibernateCourseDao;
import gun3odev3.dataAccess.JdbcCategoryDao;
import gun3odev3.entities.Category;
import gun3odev3.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1 = new Category(1, "Programlama");
		
		Category category2 = new Category(2, "Yeni Kategori");
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		
		Course course1 = new Course(1, 1, 1, "Java", "Açıklama", 450);
		
		Course course2 = new Course(2, 1, 1, "C#", "Açıklama", 300);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
			
		

	}

}
