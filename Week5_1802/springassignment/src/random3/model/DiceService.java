package random3.model;

import java.util.Random;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("diceBean")
public class DiceService implements RandomService {
	@Override
	public String getStringValue() {
		// random 1-6 and return as a string
		return "" + (new Random().nextInt(6) + 1);
	}

	public String toString() {
		return getStringValue();
	}
}
