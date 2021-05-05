
public class Instructor extends User {
	private int instructorId;
	
	public Instructor(int id, String firstName, String lastName, String lesson, int instructorId) {
		super(id, firstName, lastName, lesson);
		this.instructorId=instructorId;
	}
	
	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public void LoginStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ��renci sisteme giri� yapm��t�r...");
		
	}
	
	public void DeleteStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ��renci sistemden silinmi�tir...");
		
	}
	
	public void DetailStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ��rencinin anne-babas�n�n ismi: "
				+ student.getParentName());
	}

}
