package blservice_driver.billblservice_dirver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_driver.billblservice_driver.BillBLS_Approve_Finance_Driver;
import blservice_stub.billblservice_stub.BillBLS_Approve_Finance_Stub;

public class BillBLS_Approve_Finance_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillBLS_Approve_Finance_Driver BillBLS_Approve_Finance_Driver = new BillBLS_Approve_Finance_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		BillBLS_Approve_Finance_Driver
				.drive(new BillBLS_Approve_Finance_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("Success!\r\n" + "approve Payment successfully\r\n",
				expectedString);
	}
}
