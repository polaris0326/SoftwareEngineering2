package blservice_driver.billblservice_dirver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_driver.billblservice_driver.BillBLS_ModifyAndApprove_Driver;
import blservice_stub.billblservice_stub.BillBLS_ModifyAndApprove_Stub;



public class BillBLS_ModifyAndApprove_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillBLS_ModifyAndApprove_Driver BillBLS_ModifyAndApprove_Driver = new BillBLS_ModifyAndApprove_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		BillBLS_ModifyAndApprove_Driver.drive(new BillBLS_ModifyAndApprove_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("modify AndApprovetsuccessfully\r\n", expectedString);
	}
}
