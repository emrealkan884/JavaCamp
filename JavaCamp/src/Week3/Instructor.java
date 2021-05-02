package Week3;

public class Instructor extends User {
	private int salary;
	
	public Instructor() {
		
	}
	
	public Instructor(int salary) {
		super();
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
