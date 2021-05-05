
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
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli öðrenci sisteme giriþ yapmýþtýr...");
		
	}
	
	public void DeleteStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli öðrenci sistemden silinmiþtir...");
		
	}
	
	public void DetailStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli öðrencinin anne-babasýnýn ismi: "
				+ student.getParentName());
	}

}
