package b0r0s;


//is-a relationship -- Fish is a food
public class FishClass extends FoodClass{
	
	public FishClass(){
		super();
	}
	
	public FishClass(String name, String description) {
		super(name, description);
	}
	
	public void taste() {
		System.out.println("Oily and Salty");
	}
	@Override
	public void cost() {
		float fishcost = 3.00f;
		System.out.println(fishcost);
	}
	
	// Override behaviour from Object Class
	// Everything inherits from Object
	@Override
	public String toString() {
		return "Class: " + this.getDescription() + this.getName();
	}
	
}
