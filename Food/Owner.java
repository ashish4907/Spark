public class Owner {

	public static void main(String[] args) {
		Money money = new Money();
		money.setMoney(400);
		System.out.println("Owner giving money to servant");

		Servant servant = new Servant();
		servant.Order(money, "Paneer Butter Masla");
	}

	public void eat(Dish dish) {

		System.out.println("Owner eating" + " " + dish.getDish());

	}

}
