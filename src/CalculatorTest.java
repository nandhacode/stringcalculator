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
	@Test
	public void sumTwoStringNmbers(){
		int output = cal.sum("10,20");
		assertEquals(30, output);
	}
	@Test
	public void sumThreeStringNumber() {
		int output = cal.sum("10,20,5");
		assertEquals(35, output);
	}
	@Test
	public void sumNumberBetweenbynewline() {
		int output = cal.sum("1,\n2");
		assertEquals(3, output);
	}
}
