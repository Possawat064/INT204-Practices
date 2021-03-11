package int204.midterm1;

public class Possawat implements One {
	private double rand;

	public Possawat() {
		this.rand = Math.random();
	};

	@Override
	public double getValue() {
		return this.rand;
	}
}
