package int204.model;

public class Possawat implements Injection {
	private String tanam;
	private int october;

	public void setHead(String head) {
		this.tanam = head;
	}

	public void setTail(int tail) {
		this.october = tail;
	}

	@Override
	public String getHead() {
		return this.tanam;
	}

	@Override
	public int getTail() {
		return this.october;
	}

}
