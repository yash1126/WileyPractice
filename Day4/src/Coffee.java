
enum Coffee {
	NESCAFE(5), ESPRESSO(7), LATTE(3), CAPACINO(8);
	
	private int coffeeBeans;
	
	Coffee(int coffeeBeans){
		this.coffeeBeans = coffeeBeans;
	}
	
	
	public void prepareCoffee() {
		System.out.println("Preparing your coffee....");
	}
	
	public double calculateCost() {
		return this.coffeeBeans * 4;
	}
	
}