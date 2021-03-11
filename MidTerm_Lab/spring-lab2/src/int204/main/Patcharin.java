package int204.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import int204.main.PatcharinConfig;
import int204.midterm2.Two;

public class Patcharin {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("Spring using Java Class Configuration with Component Scanning\n");
		System.out.println();

		// load Spring Configuration from Java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PatcharinConfig.class);

		// Firstbean
		System.out.println("'FirstBean'");
		Two fb1 = (Two) context.getBean("possawat");
		Two fb2 = (Two) context.getBean("possawat");
		System.out.println("\nfb1 Name: " + fb1.getName());
		System.out.println("\nfb1 Value: " + fb1.getValue());
		System.out.println("\nfb2 Name: " + fb2.getName());
		System.out.println("\nfb2 Value: " + fb2.getValue());
		System.out.println("\nAre two references the same bean object (singleton) ? " + (fb1 == fb2));

		System.out.println();
		System.out.println();
		// Secondbean
		System.out.println("'SecondBean'");
		Two sb1 = (Two) context.getBean("tanam");
		Two sb2 = (Two) context.getBean("tanam");
		System.out.println("\nsb1 Name: " + sb1.getName());
		System.out.println("\nsb1 Value: " + sb1.getValue());
		System.out.println("\nsb2 Name: " + sb2.getName());
		System.out.println("\nsb2 Value: " + sb2.getValue());
		System.out.println("\nAre two references the same bean object (prototype) ? " + (sb1 == sb2));

		System.out.println();
		System.out.println();
		// Thirdbean
		System.out.println("'ThirdBean'");
		Two tb1 = (Two) context.getBean("ptanam");
		Two tb2 = (Two) context.getBean("ptanam");
		System.out.println("\ntb1 Name: " + tb1.getName());
		System.out.println("\ntb1 Value: " + tb1.getValue());
		System.out.println("\ntb2 Name: " + tb2.getName());
		System.out.println("\ntb2 Value: " + tb2.getValue());
		System.out.println("\nAre two references the same bean object (singleton) ? " + (tb1 == tb2));

		System.out.println();
		System.out.println();
		// Fourthbean
		System.out.println("'FourthBean'");
		Two fob1 = (Two) context.getBean("possawattanam");
		Two fob2 = (Two) context.getBean("possawattanam");
		System.out.println("\nfob1 Name: " + fob1.getName());
		System.out.println("\nfob1 Value: " + fob1.getValue());
		System.out.println("\nfob2 Name: " + fob2.getName());
		System.out.println("\nfob2 Value: " + fob2.getValue());
		System.out.println("\nAre two references the same bean object (singleton) ? " + (fob1 == fob2));

		context.close();
	}
}
