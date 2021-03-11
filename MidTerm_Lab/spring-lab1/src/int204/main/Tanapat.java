package int204.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.midterm1.One;

public class Tanapat {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("Spring using XML Configuration\n");
		System.out.println();

		// load Spring XML Configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Firstbean
		System.out.println("'FirstBean'");
		One fb1 = (One) context.getBean("possawat");
		One fb2 = (One) context.getBean("possawat");
		System.out.println("\nfb1 Value: " + fb1.getValue());
		System.out.println("\nfb2 Value: " + fb2.getValue());
		System.out.println("\nAre two references the same bean object (prototype) ? " + (fb1 == fb2));

		System.out.println();
		System.out.println();
		// Secondbean
		System.out.println("'SecondBean'");
		One sb1 = (One) context.getBean("pos");
		One sb2 = (One) context.getBean("pos");
		System.out.println("\nsb1 Value: " + sb1.getValue());
		System.out.println("\nsb2 Value: " + sb2.getValue());
		System.out.println("\nAre two references the same bean object (singleton) ? " + (sb1 == sb2));

		System.out.println();
		System.out.println();
		// Thirdbean
		System.out.println("'ThirdBean'");
		One tb1 = (One) context.getBean("tanam");
		One tb2 = (One) context.getBean("tanam");
		System.out.println("\ntb1 Value: " + tb1.getValue());
		System.out.println("\ntb2 Value: " + tb2.getValue());
		System.out.println("\nAre two references the same bean object (singleton) ? " + (tb1 == tb2));

		System.out.println();
		System.out.println();
		// Fourthbean
		System.out.println("'Fourthbean'");
		One fob1 = (One) context.getBean("poss");
		One fob2 = (One) context.getBean("poss");
		System.out.println("\fob1 Value: " + fob1.getValue());
		System.out.println("\fob2 Value: " + fob2.getValue());
		System.out.println("\nAre two references the same bean object (singleton) ? " + (fob1 == fob2));

		System.out.println();
		System.out.println();
		// Fifthbean
		System.out.println("'Fifthbean'");
		One fib1 = (One) context.getBean("anam");
		One fib2 = (One) context.getBean("anam");
		System.out.println("\fib1 Value: " + fib1.getValue());
		System.out.println("\fib2 Value: " + fib2.getValue());
		System.out.println("\nAre two references the same bean object (singleton) ? " + (fib1 == fib2));

		context.close();
	}
}
