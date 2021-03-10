package int204p1.ex01.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204p1.ex01.model.EmailAddress;
import int204p1.ex01.model.InformationService;

public class SpringIoCMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		InformationService is1 = (InformationService) context.getBean("eml");
		InformationService is2 = (InformationService) context.getBean("web");

		InformationService is3 = context.getBean("eml", InformationService.class);
		InformationService is4 = context.getBean("web", InformationService.class);

		System.out.println();
		System.out.println(is1.getInfoService());
		System.out.println(is2.getInfoService());
		System.out.println(is3.getInfoService());
		System.out.println(is4.getInfoService());
		System.out.println();

		System.out.println("2 beans are the same (is1, is2)? " + (is1 == is3)); // false //different bean, different
																				// object
		System.out.println("2 beans are the same (is1, is3)? " + (is2 == is4)); // true //singleton bean scope for same
																				// service (default),shared object for a
																				// class
		System.out.println();
		EmailAddress em = context.getBean("emad", EmailAddress.class);
		System.out.println(em);

		System.out.println();
		InformationService ems = (InformationService) context.getBean("ease");
		System.out.println(ems.getInfoService());
		
		context.close();
	}
}
