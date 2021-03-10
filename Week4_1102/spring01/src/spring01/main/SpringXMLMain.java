package spring01.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring01.model.DbInfoService;
import spring01.model.EmailInfoService;

public class SpringXMLMain {

	public static void main(String[] args) {

		// load Spring XML Configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Question1
		EmailInfoService em1 = (EmailInfoService) context.getBean("emailBean");
		EmailInfoService em2 = context.getBean("emailBean", EmailInfoService.class);

		DbInfoService db1 = (DbInfoService) context.getBean("dbBean");
		DbInfoService db2 = context.getBean("dbBean", DbInfoService.class);

		System.out.println("");

		System.out.println("2 beans email are the same (em1, em2)? " + (em1 == em2));

		System.out.println("2 beans db are the same (db1, db2)? " + (db1 == db2));

		System.out.println("");
		System.out.println("");

		// get bean and call its method
		// Question 3
		EmailInfoService emq3 = context.getBean("emailConst", EmailInfoService.class);
		System.out.println(emq3);

		// Question 4
		EmailInfoService emq4 = context.getBean("emailSetter", EmailInfoService.class);
		System.out.println(emq4);

		// Question 5
		EmailInfoService emq5 = context.getBean("emailProp", EmailInfoService.class);
		System.out.println(emq5);

		System.out.println("");

		// close context
		context.close();
	}

}
