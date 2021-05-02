package Week4.Entities;

public class Campaign {
	private int id;
	private int name;
	private String description;
	private double discountAmount;
	
	public Campaign() {
		
	}

	public Campaign(int id, int name, String description, double discountAmount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.discountAmount = discountAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	
}	
