
public class AnimalApp {
	

	public static void displayAnimal(Animal animal) {
		animal.talk();
		animal.breath();
		animal.eat();
		if(animal instanceof Dog ) // instance of operator check type of object
			((Dog) animal).trainMe();
		
		
	}

	public static void main(String[] args) {
		
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		displayAnimal(dog);
		displayAnimal(cat);
	
		
	}
}