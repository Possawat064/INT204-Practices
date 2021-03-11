package int204.midterm2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("possawat")
@Scope("singleton")
public class Possawat implements Two {
	@Value("possawat")
	protected String varName;
	@Value("64")
	protected int varValue;

	@Override
	public String getName() {
		return this.varName;
	}

	@Override
	public int getValue() {
		return this.varValue;
	}
}
