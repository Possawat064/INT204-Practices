package random1.model;

public class CoinService implements RandomService {

	double chanceOfHead;

	public CoinService() {
	}

	public CoinService(double chanceOfHead) {
		this.chanceOfHead = chanceOfHead;
	}

	// <property name ="chance" value = "0.5" />
	public void setchanceOfHead(double chance) {
		chanceOfHead = chance;
	}

	@Override
	public String getStringValue() {
		// random 0-1 and return as string "tail" or "head"
		double randnum = Math.random() * 1;

		if (1 - randnum <= chanceOfHead) {
			return "head";
		} else {
			return "tail";
		}
	}

}
