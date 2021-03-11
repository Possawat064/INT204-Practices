package int204.midterm2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("ptanam")
@PropertySource("classpath:tanam.properties")
public class PTanam extends Possawat {

	@Value("${initialize}")
	public void initialize(String init) {
		this.varName = init;
		this.varValue = init.length();
	}
}
