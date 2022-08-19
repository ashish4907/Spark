import java.util.ArrayList;
import java.util.List;

public class Servant {

	void Order(Money money, String foodName) {
		System.out.println("Servant taking money from owner");
		money.getMoney(400);
		ShopKeeper shopkeeper = new ShopKeeper();
		List<Ingredient> sh = shopkeeper.order(makingList(), money);
		Cook cook = new Cook();
		cook.prepearingfood(sh, foodName);

	}

	List<String> makingList() {
		System.out.println("Servant making list");
		List<String> ingredient = new ArrayList<String>();
		ingredient.add("Panee");
		ingredient.add("Butter");
		ingredient.add("Fresh Cream");
		ingredient.add("Garam Masala");
		return ingredient;
	}

}
