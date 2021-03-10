package int204.spring.main;

import int204.spring.model.Animal;
import int204.spring.model.Cat;
import int204.spring.model.Dog;

public class MainApp {

	public static void main(String[] args) {
		Animal a = new Dog();
		Animal c = new Cat();
		System.out.println(a.getVoice());
		System.out.println(c.getVoice());
	}
}
