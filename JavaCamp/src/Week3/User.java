package Week3;

public class User {
	private int age;
	private String nationalIdentity;
	private int id;
	private String firstName;
	private String lastName;
	
	public User() {
		
	}
	
	public User(int age, String nationalIdentity, int id, String firstName, String lastName) {
		super();
		this.age = age;
		this.nationalIdentity = nationalIdentity;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
}
