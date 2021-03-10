package int204.spring101.main;

import int204.spring101.model.Developer;
import int204.spring101.model.Person;

public class MainApplication {

	public static void main(String[] args) {
		Person p = new Developer();
		System.out.println(p.getToKnowMe());
	}

}
