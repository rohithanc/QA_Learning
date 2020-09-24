package b0r0s;

public class FoodClass {

// Attributes
	protected String name;
	protected String description;
	
	public FoodClass() {
		super(); // OBJECT.CLASS CONSTRUCTOR
	}
	
	public FoodClass(String name, String description) {
		super();
		this.name= name;
		this.description = description;
	}
	
// Methods
	public void cost() {
		float foodcost = 2.00f;
		System.out.println(foodcost);
	}
// Setters and Getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
