package gun3odev3.entities;

public class Course {
	
	private int id;
	private int categoryId;
	private int instructorId;
	private String name;
	private String description;
	private double price;
	
	public Course() {
		
	}
	
	public Course(int id, int categoryId, int instructorId, String name, String description, double price) {
		this.id = id;
		this.categoryId = categoryId;
		this.instructorId = instructorId;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
