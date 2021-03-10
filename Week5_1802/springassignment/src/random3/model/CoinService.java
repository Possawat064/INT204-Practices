package random3.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("propertyCoinBean")

public class CoinService implements RandomService {

	@Value("${coin.headChance}")
	double chanceOfHead;

	public CoinService() {
	}

	public CoinService(double chanceOfHead) {
		this.chanceOfHead = chanceOfHead;
	}

	// <property name ="chance" value = "0.5" />

	public void setChance(double chance) {
		chanceOfHead = chance;
	}

	@Override
	public String getStringValue() {
		double randnum = Math.random() * 1;

		if (1 - randnum <= chanceOfHead) {
			return "head";
		} else {
			return "tail";
		}
	
	} 

}
