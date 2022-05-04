import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RehoLorenzoTest_A {

	@Test
	public void testRehoMet1() {
		RehoLorenzoClass rehoLorenzoClass = new RehoLorenzoClass();
		int risultatoAtteso = 6;
		int risultatoOttenuto = rehoLorenzoClass.rehoMet(3);
		assertEquals(risultatoAtteso, risultatoOttenuto);
	}
	
	@Test
	public void testRehoMet2() {
		RehoLorenzoClass rehoLorenzoClass = new RehoLorenzoClass();
		int risultatoAtteso = 15;
		int risultatoOttenuto = rehoLorenzoClass.rehoMet(5);
		assertEquals(risultatoAtteso, risultatoOttenuto);
	
	}

	@Test
	public void testRehoMet3() {
		RehoLorenzoClass rehoLorenzoClass = new RehoLorenzoClass();
		int risultatoAtteso = 10;
		int risultatoOttenuto = rehoLorenzoClass.rehoMet(4);
		assertEquals(risultatoAtteso, risultatoOttenuto);	
	}
	

}
