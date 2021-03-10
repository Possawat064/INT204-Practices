package random3.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import random3.model.RandomService;

public class RandomMain {
	public static void main(String[] args) {

		System.out.println("Spring Loc with Java Class Component Scan\n");

		// load Spring XML Configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringComponentScanConfig.class);

		RandomService rs1 = (RandomService) context.getBean("diceBean");
		// System.out.println(rs1);

		System.out.print("Dice :");
		for (int i = 0; i < 30; i++)
			System.out.print(" " + rs1.getStringValue());
		System.out.println();

		RandomService rs2 = (RandomService) context.getBean("propertyCoinBean");
		// System.out.println(rs2);

		System.out.print("Coin :");
		for (int i = 0; i < 15; i++)
			System.out.print(" " + rs2.getStringValue());
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