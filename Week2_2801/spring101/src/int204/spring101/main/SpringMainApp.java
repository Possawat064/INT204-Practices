package int204.spring101.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.spring101.model.Person;

public class SpringMainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Person p = context.getBean("sa", Person.class);
		
		System.out.println(p.getToKnowMe());

		context.close();
	}

}
