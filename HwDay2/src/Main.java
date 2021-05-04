
public class Main {

	public static void main(String[] args) {
		Courses courses1 = new Courses(
				1,
				"Software Developer Training Camp (C# + ANGULAR)");
		
		Courses courses2 = new Courses(
				2,
				"Software Developer Training Camp (Java + React) ");
		
		Courses courses3 = new Courses();
				courses3.id= 3;
				courses3.courseName= "Basic Course for Introduction to Programming";
				
		Courses[] courses = {courses1,courses2,courses3};
				for (Courses course : courses) {
					System.out.println("Kurslar:"+""+course.courseName+"");
				}
		Teachers teacher1 = new Teachers(
				1,
				"Engin",
				"Demirog");
		Teachers teacher2 = new Teachers(
				1,
				"Kerem",
				"Varýþ");
		Teachers teacher3 = new Teachers(
				1,
				"xxxx",
				"yyyy");
		
		System.out.println("---------------------------------------------------");	
		Teachers[] teachers = {teacher1,teacher2,teacher3};
		for (Teachers teacher: teachers) {
			System.out.println("Eðitmenler:"+" "+teacher.name+" "+teacher.lastName+" ");
		}
		System.out.println("---------------------------------------------------");	
		CourseManager courseManager = new CourseManager();
		courseManager.add(courses2, teacher1);

	}

}
