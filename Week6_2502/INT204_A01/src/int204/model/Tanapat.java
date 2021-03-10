package int204.model;

import java.util.List;

public class Tanapat {
	private List<Injection> myList;

	public Tanapat() {
	};

	public Tanapat(List<Injection> myList) {
		this.myList = myList;
	}

	public List<Injection> getList() {
		return this.myList;
	}
}
