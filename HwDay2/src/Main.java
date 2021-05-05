
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "Matematik", 1);
		Instructor instructor2 = new Instructor(2, "Kerem", "Varış", "Türkçe", 2);
		
		InstructorManager instructorManager = new InstructorManager();
		System.out.println("Eğitmenlerimiz:");
		instructorManager.LoginInstructor(instructor2);
	    instructorManager.LoginInstructor(instructor1);
	    System.out.println("------------------------");
	    System.out.println("Çıkarılan eğitmenler:");
	    instructorManager.DeleteInstructor(instructor2);
	    System.out.println("------------------------");
	    
	    Student student1 = new Student(3, "Aslı" , "Tangöz","Matematik","Nezih");
	    Student student2 = new Student(4, "Kerem", "Gönlüm","Türkçe", "Mustafa");
	    Student student3 = new Student(5, "Gül", "Tavlan","Türkçe","Mehmet");
	    
	    StudentManager studentManager = new StudentManager();
	    System.out.println("Öğrencilerimiz:");
	    studentManager.DetailStudent(student1);
	    studentManager.DetailStudent(student2);
	    studentManager.DetailStudent(student3);
	    System.out.println("----------------------");
	    System.out.println("Güncellenen öğrenciler:");
	    studentManager.DeleteStudent(student2);
	    System.out.println("---------------");
	    System.out.println("Öğrenci giriş:");
	    studentManager.LoginStudent(student3);
	    studentManager.LoginStudent(student1);
	    
	    User user1 = new User(7, "Furkan", "Tetik", "Türkçe");
	    User user2 = new User(12, "Emir", "Cansuz", "Matematik");
	    UserManager userManager = new UserManager();
	    System.out.println("Kullanıcılar:");
	    userManager.LoginUser(user2);
	    userManager.LoginUser(user1);
	}
}
