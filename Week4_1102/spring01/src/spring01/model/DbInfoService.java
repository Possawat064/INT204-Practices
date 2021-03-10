package spring01.model;

public class DbInfoService implements GenericInfoService {

	public DbInfoService() {

	}

	@Override
	public String getName() {
		return "database";
	}

	@Override
	public void initMethod() {
		System.out.println("db service initialization");
	}

	@Override
	public void endMethod() {
		System.out.println("db service ending");

	}

	@Override
	public String toString() {
		return "DbInfoService []";
	}
}
