package int204.midterm1;

public class Tanam implements One {
	private double anam;

	public Tanam() {
	};

	public Tanam(double anam) {
		this.anam = anam;
	}

	public void setAnam(double anam) {
		this.anam = anam;
	}

	@Override
	public double getValue() {
		return anam;
	}
}
