package b0r0s;

public class MeatClass extends FoodClass {
	public MeatClass() {
		super();
	}
	public MeatClass(String name, String description) {
		super(name, description);
	}
	
	@Override
	public void cost() {
		float meatcost = 4.00f;
		System.out.println(meatcost);
	}
	//Auto-generated constructor stub
}
