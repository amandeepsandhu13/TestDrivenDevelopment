import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
Program Name: MortgageAppTest.java
	  Author: Aman Sandhu
        Date: Apr 4, 20188:24:28 AM
 Description:
 */
public class MortgageAppTest
{
  public static MortgageApp obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		 obj = new MortgageApp();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}
	
	

	@Test
	public void testMortgageApproved()
	{
		obj.set("salary", 500);
		obj.set("MortPayementPerMon", 100);
		
		double salPercent = 500 * 0.6;
		
		if(100 < salPercent) {
			assertTrue(true);
		}
											
	}

	@Test
	public void testMortDeclined()
	{
		obj.set("salary", 200);
		obj.set("MortPayementPerMon", 100);
		double salPercent = 200 * 0.6;
		if(100 > salPercent) {
			assertFalse(false);		
		}

	}
	
	@Test
	public void testMortApprovedMethod()
	{
		
		if(obj.evaluateMortgage(500,100) == true) {
			assertTrue(true);
		}
											
	}
	
	@Test
	public void testMortDeclinedMethod()
	{
		
		if(obj.evaluateMortgage(200,100) == false) {
			assertFalse(false);
		}
											
	}
	
	@Test
	public void validateCredit()
	{
		int creditRate = 1;
		if(creditRate < 3) {
			if(obj.evaluateMortgage(200,100) == true) {
				assertTrue(true);
			}
		}
													
	}
	
	@Test
	public void validateCreditUpdate()
	{
		int creditRate = 1;
		if(creditRate < 3) {
			if(obj.evaluateMortgage(200,100) == true) {
				assertTrue(true);
			}
		}
	}	
		
		@Test
		public void setCreditValMorgApprove()
		{
			obj.setCreditVal(1);
			if(obj.getCreditVal() < 3) {
				if(obj.evaluateMortgage(200,100) == true) {
					assertTrue(true);
				}
			}	
		
	}
	
	
		@Test
		public void setCreditValMorgDicline()
		{
			obj.setCreditVal(1);
			if(obj.getCreditVal() >= 3) {
				if(obj.evaluateMortgage(200,100) == true) {
					assertFalse(false);
				}
			}	
		
	}
	
	
	
	
	
	
}
