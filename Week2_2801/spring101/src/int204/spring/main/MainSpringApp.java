package int204.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.spring.model.Animal;

public class MainSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Animal d = context.getBean("myDog", Animal.class);
		Animal c = context.getBean("myCat", Animal.class);
		System.out.println(d.getVoice());
		System.out.println(c.getVoice());
	}
	
	/*public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Animal a = context.getBean("myPet", Animal.class);
			System.out.println(a.getVoice());
		}
	}*/

}
