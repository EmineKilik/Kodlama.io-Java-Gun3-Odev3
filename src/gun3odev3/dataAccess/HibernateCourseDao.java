package gun3odev3.dataAccess;

import java.util.ArrayList;
import java.util.List;

import gun3odev3.entities.Course;

public class HibernateCourseDao implements CourseDao{
	
	private List<Course> courses = new ArrayList<>();

	public void add(Course course) {
		courses.add(course);
		System.out.println(course.getName() + " Hibernate ile veritabanına eklendi.");
	}

	@Override
	public Course findByName(String courseName) {
		for(Course course : courses) {
			if(course.getName() == courseName) {
				return course;
			}
		}
		return null;
	}
	
}
