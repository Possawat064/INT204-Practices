package int204p1.ex01.model;

public class EmailAddressService implements InformationService {
	private EmailAddress emailAddress;

	public EmailAddressService(EmailAddress emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}

	@Override
	public String getInfoService() {
		return "Service: " + emailAddress.toString();
	}
}
