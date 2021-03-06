package test;

import static org.junit.Assert.*;
import main.CalculatorDouble;

import org.junit.Test;

public class CalculatorTestDouble {

CalculatorDouble calculator = new CalculatorDouble();
	
	@Test
	public void assertAdd(){
		assertEquals(5.6, calculator.add(2.2, 3.4), 0);
	}
	
	@Test
	public void assertSub(){
		assertEquals(0, calculator.sub(1.7, 1.7), 0);
	}
	
	@Test
	public void assertMulti(){
		assertEquals(2.3, calculator.multi(2.1, 1.1), 0.011);
	}
	
	@Test
	public void assertDiv(){
		assertEquals(2, calculator.div(4.1, 2.1), 0.05);
	}
	
	@Test
	public void assertGreater(){
		assertEquals(true, calculator.greater(4.1, 2.1));
	}

}
