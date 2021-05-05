
public class InstructorManager extends UserManager {
	public void LoginInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+
				" isimli e�itmen "+instructor.getLesson()+" dersine giri� yapmt�r...");
	}
	public void UpdateInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+
				" isimli e�itmen art�k"+instructor.getLesson()+"dersine giri� yapmas� i�in g�ncellenmi�tir...");
	}
	public void DeleteInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli e�itmen, bundan sonra " + 
	instructor.getLesson() + " dersleri vermeyecektir...");
	}
}
