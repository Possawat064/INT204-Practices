package random1.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import random1.model.DiceService;
import random1.model.RandomService;

public class RandomMain {
	public static void main(String[] args) {

		System.out.println("Spring using XML Configuration\n");

		// load Spring XML Configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("random01.xml");

		RandomService rs1 = (RandomService) context.getBean("diceBean");
		System.out.print("Dice :");
		for (int i = 0; i < 30; i++)
			System.out.print(" " + rs1.getStringValue());
		System.out.println();

		RandomService rs2 = (RandomService) context.getBean("fairCoinBean");
		System.out.print("Coin :");
		for (int i = 0; i < 15; i++)
			System.out.print(" " + rs2.getStringValue());
		System.out.println();

		RandomService rs3 = (RandomService) context.getBean("biasCoinBean");
		System.out.print("Coin :");
		for (int i = 0; i < 15; i++)
			System.out.print(" " + rs3.getStringValue());
		System.out.println();

		RandomService rs4 = (RandomService) context.getBean("propertyCoinBean");
		System.out.print("Coin :");
		for (int i = 0; i < 15; i++)
			System.out.print(" " + rs4.getStringValue());
		System.out.println();

		// close context
		context.close();
	}
}

/*
 * 1. diceBean - IoC 2. fairCoinBean - DI constructor injection 0.5
 * 3.biasCoinBean - DI setter injection 0.1 4. propertyCoinBean - DI setter
 * injection read from property file
 * 
 * - random01 - xml configuration: 1-4 - random03 - java class with component
 * scanning: 1 and one of 2,3,4
 */