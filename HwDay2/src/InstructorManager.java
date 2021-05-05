
public class InstructorManager extends UserManager {
	public void LoginInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+
				" isimli eðitmen "+instructor.getLesson()+" dersine giriþ yapmtýr...");
	}
	public void UpdateInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+
				" isimli eðitmen artýk"+instructor.getLesson()+"dersine giriþ yapmasý için güncellenmiþtir...");
	}
	public void DeleteInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmen, bundan sonra " + 
	instructor.getLesson() + " dersleri vermeyecektir...");
	}
}
