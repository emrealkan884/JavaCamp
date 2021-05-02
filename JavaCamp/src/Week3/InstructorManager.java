package Week3;

public class InstructorManager extends UserManager {
	public void add(User user) {
    	System.out.println(user.getFirstName() + " Eðitmen Eklendi!");
    }
    
    public void delete(User user) {
    	System.out.println(user.getFirstName() + " Eðitmen Silindi!");
    }
    
    public void update(User user) {
    	System.out.println(user.getFirstName() + " Eðitmen Güncellendi!");
    }
    
}
