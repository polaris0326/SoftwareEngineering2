package blservice_driver.billblservice_dirver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_driver.billblservice_driver.BillBLS_BatchApprove_Driver;
import blservice_stub.billblservice_stub.BillBLS_BatchApprove_Stub;

public class BillBLS_BatchApprove_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillBLS_BatchApprove_Driver billBLS_BatchApprove_Driver = new BillBLS_BatchApprove_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		billBLS_BatchApprove_Driver.drive(new BillBLS_BatchApprove_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("approve batch successfully\r\n", expectedString);
	}
}
