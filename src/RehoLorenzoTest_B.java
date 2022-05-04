import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RehoLorenzoTest_B {
	
	private RehoLorenzoClass rehoLorenzoClass;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		rehoLorenzoClass = new RehoLorenzoClass();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRehoMet1() {
		int risultatoAtteso = 6;
		int risultatoOttenuto = rehoLorenzoClass.rehoMet(3);
		assertEquals(risultatoAtteso, risultatoOttenuto);
	}
	
	@Test
	public void testRehoMet2() {
		int risultatoAtteso = 15;
		int risultatoOttenuto = rehoLorenzoClass.rehoMet(5);
		assertEquals(risultatoAtteso, risultatoOttenuto);
	
	}

	@Test
	public void testRehoMet3() {
		int risultatoAtteso = 10;
		int risultatoOttenuto = rehoLorenzoClass.rehoMet(4);
		assertEquals(risultatoAtteso, risultatoOttenuto);	
	}
	
}
