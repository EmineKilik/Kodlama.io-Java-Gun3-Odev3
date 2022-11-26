package gun3odev3.business;

import gun3odev3.core.logging.Logger;
import gun3odev3.dataAccess.CourseDao;
import gun3odev3.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(courseDao.findByName(course.getName()) != null) {
			throw new Exception("Kurs ismi tekrar edemez.");
		}
		if(course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı sıfırdan küçük olamaz.");
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}

}
