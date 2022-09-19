
public class CoffeeApp {

	public static void main(String[] args) {
		Coffee coffee = Coffee.ESPRESSO;
		coffee.prepareCoffee();
		System.out.println("Your total cost is - " + coffee.calculateCost());

	}

}