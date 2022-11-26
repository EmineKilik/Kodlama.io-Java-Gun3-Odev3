package gun3odev3.dataAccess;

import gun3odev3.entities.Course;

public interface CourseDao {

	void add(Course course);
	Course findByName(String courseName);
	
}
