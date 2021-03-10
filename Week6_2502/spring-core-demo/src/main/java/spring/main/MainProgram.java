package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.demo.NameService;

public class MainProgram {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext01.xml");
		
		NameService ns1 = (NameService) context.getBean("firstBean");
		NameService ns2 = (NameService) context.getBean("secondBean");
		
		System.out.println(ns1.getName());
		System.out.println(ns2.getName());
		((ClassPathXmlApplicationContext) context).close();
	}
}