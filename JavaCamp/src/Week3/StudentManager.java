package Week3;

public class StudentManager extends UserManager {
	public void add(Student student) {
    	System.out.println(student.getFirstName() + " ��renci Eklendi!");
    }
    
    public void delete(Student student) {
    	System.out.println(student.getFirstName() + " ��renci Silindi!");
    }
    
    public void update(Student student) {
    	System.out.println(student.getFirstName() + " ��renci G�ncellendi!");
    }
    
}
