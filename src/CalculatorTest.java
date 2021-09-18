import static org.junit.Assert.*;

import org.junit.Test;
public class CalculatorTest {

	Calculator cal = new Calculator();
	@Test
	public void sumEmptyString() {
		int output = cal.sum("");
		assertEquals(0, output);
	}
	
	@Test
	public void sumSingleNumber(){
		int output = cal.sum("10");
		assertEquals(10, output);
	}

}
