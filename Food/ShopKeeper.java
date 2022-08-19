import java.util.ArrayList;

import java.util.List;

public class ShopKeeper {

	public List<Ingredient> order(List<String> makingList, Money money) {
		System.out.println("Shopkeeper Taking Money And Returning Ingredients objects");
		List<Ingredient> ingredient = new ArrayList<Ingredient>();


		ingredient.add(new Paneer());
		ingredient.add(new Butter());
		ingredient.add(new FreshCream());
		ingredient.add(new GaramMasla());

		return ingredient;

	}

}
