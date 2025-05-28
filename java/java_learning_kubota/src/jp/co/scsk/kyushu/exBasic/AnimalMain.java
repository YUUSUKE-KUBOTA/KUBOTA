package jp.co.scsk.kyushu.exBasic;

public class AnimalMain {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Ostrich ostrich = new Ostrich();
		
		dog.cry();
		dog.run();
		cat.cry();
		cat.run();
		ostrich.cry();
		ostrich.run();
	}
}
