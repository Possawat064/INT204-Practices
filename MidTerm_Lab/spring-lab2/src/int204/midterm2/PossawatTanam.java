package int204.midterm2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("possawattanam")
public class PossawatTanam implements Two {
	private Two first;
	private Two last;

	@Autowired
	@Qualifier("possawat")
	public void setName(Two name) {
		this.first = name;
	}

	@Autowired
	@Qualifier("tanam")
	public void setValue(Two value) {
		this.last = value;
	}

	@Override
	public String getName() {
		return this.first.getName();
	}

	@Override
	public int getValue() {
		return this.last.getValue();
	}

}
