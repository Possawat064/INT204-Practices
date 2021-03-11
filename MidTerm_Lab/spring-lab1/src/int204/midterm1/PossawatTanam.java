package int204.midterm1;

public class PossawatTanam implements One {

	private One first;
	private One last;

	public PossawatTanam(One first, One last) {
		super();
		this.first = first;
		this.last = last;
	}

	@Override
	public double getValue() {
		return first.getValue() + last.getValue();
	}
}
