package Week3;

public class InstructorManager extends UserManager {
	public void add(User user) {
    	System.out.println(user.getFirstName() + " E�itmen Eklendi!");
    }
    
    public void delete(User user) {
    	System.out.println(user.getFirstName() + " E�itmen Silindi!");
    }
    
    public void update(User user) {
    	System.out.println(user.getFirstName() + " E�itmen G�ncellendi!");
    }
    
}
