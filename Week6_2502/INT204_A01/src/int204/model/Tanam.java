package int204.model;

public class Tanam implements Injection {

	private Possawat possawat;

	public Tanam() {
	};

	public Tanam(Possawat possawat) {
		this.possawat = possawat;
	}

	@Override
	public String getHead() {
		return this.possawat.getHead();
	}

	@Override
	public int getTail() {
		return this.possawat.getHead().length();
	}

}
