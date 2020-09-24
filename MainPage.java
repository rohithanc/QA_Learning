package b0r0s;

import java.util.ArrayList;

public class MainPage {

	public static void main(String[] args) {
		FoodClass chicken= new MeatClass();
		MeatClass pork = new MeatClass();
		pork.cost();
		FoodClass salmon = new FishClass();
		FishClass cod = new FishClass();
		salmon.cost();
		cod.cost();
		FoodClass carrot = new FoodClass();
		
		ArrayList<FoodClass> foodMenu = new ArrayList<>();
		
		foodMenu.add(chicken);
		foodMenu.add(carrot);
		foodMenu.add(pork);
		foodMenu.add(chicken);
		foodMenu.add(carrot);
		foodMenu.add(chicken);
		foodMenu.add(pork);
		foodMenu.add(cod);
		foodMenu.add(salmon);
		
		for (FoodClass obj : foodMenu) {
			if (obj instanceof FishClass) {
				obj.cost();
				FishClass target = (FishClass) obj;
				target.cost();
			} else {
				FoodClass target = (FoodClass) obj;
				target.cost();
			}
		}
	}
}
