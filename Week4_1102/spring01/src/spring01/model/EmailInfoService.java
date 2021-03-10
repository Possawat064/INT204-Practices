package spring01.model;

public class EmailInfoService implements GenericInfoService {

	private String address;

	public EmailInfoService() {

	}

	public EmailInfoService(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getName() {
		return "email";
	}

	@Override
	public void initMethod() {
		System.out.println("email service initialization");
	}

	@Override
	public void endMethod() {
		System.out.println("email service ending");

	}

	@Override
	public String toString() {
		return "EmailInfoService : [address=" + address + "]";
	}
}
