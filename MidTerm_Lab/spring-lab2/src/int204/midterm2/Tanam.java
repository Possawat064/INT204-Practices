package int204.midterm2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tanam")
@Scope("prototype")
public class Tanam extends Possawat {

	public Tanam(@Value("possawat") String varName, @Value("64") int varValue) {
		super();
		this.varName = varName;
		this.varValue = varValue;
	}
}
