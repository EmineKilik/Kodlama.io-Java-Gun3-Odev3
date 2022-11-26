package gun3odev3.dataAccess;

import gun3odev3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() 
				+ " Hibernate ile veritabanına eklendi.");
	}

}
