package int204.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.model.Injection;
import int204.model.Possawat;
import int204.model.Tanapat;
import int204.model.Tanam;

public class Patcharin {
	public static void main(String[] args) {

		// load Spring XML Configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Injection x = (Injection) context.getBean("me");
		System.out.println(x.getHead() + " " + x.getTail());

		Injection y = (Injection) context.getBean("mine");
		System.out.println(y.getHead() + " " + y.getTail());

		System.out.println("");
		Tanapat z = (Tanapat) context.getBean("listBean");
		System.out.println(z.getList());
		System.out.println("Are two references the same bean object (prototype) ? " + (z.getList().get(0) == x));
		System.out.println("Are two references the same bean object (singleton) ? " + (z.getList().get(1) == y));

		// close context
		context.close();

	}

}
