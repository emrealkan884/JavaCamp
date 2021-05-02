package Week3;

public class Main {

	public static void main(String[] args) {
		
	Instructor instructor1 = new Instructor();
	instructor1.setAge(28);
	instructor1.setId(1);
	instructor1.setNationalIdentity("123456789");
	instructor1.setSalary(55000);
	instructor1.setFirstName("Engin");
	instructor1.setLastName("Demiroğ");
	
	Student student1 = new Student(75);
	student1.setAge(18);
	student1.setId(2);
	student1.setNationalIdentity("987654321");
	student1.setFirstName("Emre");
	student1.setLastName("Alkan");
	
	
	InstructorManager instructorManager = new InstructorManager();
	instructorManager.add(instructor1);
	
	StudentManager studentManager = new StudentManager();
	studentManager.add(student1);
	
	
	

	}

}
