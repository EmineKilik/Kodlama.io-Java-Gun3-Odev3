package gun3odev3.business;

import gun3odev3.core.logging.Logger;
import gun3odev3.dataAccess.InstructorDao;
import gun3odev3.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + instructor.getLastName());
		}
		
	}

}
