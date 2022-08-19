import java.util.List;

public class Cook {
	void prepearingfood(List<Ingredient> sh, String foodName) {
		System.out.println("Cook Preparing food");
		Dish dish = new Dish();
		dish.setDish(foodName);
		Owner owner = new Owner();
		owner.eat(dish);

	}

}
