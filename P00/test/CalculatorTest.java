import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
		//addition
		public void testAdd() {
			int a = 4321;
			int b = 1234;
				
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 
				 
			int expected = 5555;
			assertEquals (expected, actual);
			}
		//subtract
		public void testSubtract() {
			int a = 8558;
			int b = 2587;
		
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b); 
		 
			int expected = 5971;
			assertEquals (expected, actual);
				}
		//multiplication
		public void testMultiple() {
			int a = 5892;
			int b = 5908;
				
			Calculator cal = new Calculator();
			int actual = cal.multiple(a, b); 
				 
			int expected = 34809636;
			assertEquals (expected, actual);
			}
		//division
		public void testDivide() {
			int a = 6500;
			int b = 2;
				
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b); 
				 
			int expected = 3250;
			assertEquals (expected, actual);
			}
		public void testDivideifError() {
			int a = 9700;
			int b = 0;
				
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b); 
				 
			
			assertNull (actual);
			}
		
}	




	


