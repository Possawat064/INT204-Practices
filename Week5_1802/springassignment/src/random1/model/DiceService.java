package random1.model;

import java.util.Random;

public class DiceService implements RandomService {
	@Override
	public String getStringValue() {
		// random 1-6 and return as a string
		return "" + (new Random().nextInt(6) + 1);
	}

	@Override
	public String toString() {
		return "DiceService []";
	}
}
