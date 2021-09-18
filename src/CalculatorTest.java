import static org.junit.Assert.*;

import org.junit.Test;
public class CalculatorTest {

	Calculator cal = new Calculator();
	@Test
	public void sumEmptyString() {
		int output = cal.sum("");
		assertEquals(0, output);
	}

}
