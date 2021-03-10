package int204p1.ex01.main;

import int204p1.ex01.model.EmailInfoService;
import int204p1.ex01.model.InformationService;
import int204p1.ex01.model.WebInfoService;

public class SimpleMain {

	public static void main(String[] args) {
		InformationService web = new WebInfoService();
		InformationService eml = new EmailInfoService();
		System.out.println(web.getInfoService());
		System.out.println(eml.getInfoService());
	}

}
