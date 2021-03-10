package spring.demo;

public class FirstSpring implements NameService {
	private String name;

	public FirstSpring() {
	}

	public FirstSpring(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
