package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import testclass.Calculator;

class CalculatorTest {
	@Test
	void addCal() {
		Calculator cal = new Calculator();
		int res = cal.add(5,2);
		assertEquals(7, res);
	}
	
	@Test
	void subCal() {
		Calculator cal = new Calculator();
		int res = cal.subtract(5,2);
		assertEquals(3, res);
	}

	@Test
	void multiplyCal() {
		Calculator cal = new Calculator();
		int res = cal.multiply(5,2);
		assertEquals(10, res);
	}

	@Test
	void divideCal() {
		Calculator cal = new Calculator();
		int res = cal.divide(6,2);
		assertEquals(3, res);
	}

	
}
