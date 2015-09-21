package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TotalTuitionBillTest {

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
	public void testTuitonBillRepaymentCalc() {
		// The myBill 12 represents a repayment term of 12 years, so on and so forth
		// I know these are wrong, mainly because I can't run the program to see if they work
		TotalTuitionBill myBill12 = new TotalTuitionBill();
		TotalTuitionBill myBill13 = new TotalTuitionBill();
		assertTrue(myBill12.FinanceFunction() == true);
		assertFalse(myBill13.FinanceFunction() == true);
		
		TotalTuitionBill myBill14 = new TotalTuitionBill();
		TotalTuitionBill myBill15 = new TotalTuitionBill();
		assertTrue(myBill14.FinanceFunction() == true);
		assertFalse(myBill15.FinanceFunction() == true);
	}

}
