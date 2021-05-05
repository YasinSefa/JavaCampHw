
public class Student extends User {
	private String parentName;
	
	public Student(int id, String firstName, String lastName, String lesson, String parentName) {
		super(id, firstName, lastName, lesson);
		this.parentName=parentName;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
