package int204p1.ex01.model;

public class EmailAddress {
	private String name;
	private String address;

	public EmailAddress() {
	}

	public EmailAddress(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmailAddress [name=" + name + ", address=" + address + "]";
	}

}
