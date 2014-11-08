package blservice_driver.billblservice_dirver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;


import blservice_driver.billblservice_driver.BillBLS_Info_Unsettled_Driver;

import blservice_stub.billblservice_stub.BillBLS_Info_Unsettled_Stub;

public class BillBLS_Info_Unsettled_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillBLS_Info_Unsettled_Driver BillBLS_Info_Unsettled_Driver = new BillBLS_Info_Unsettled_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		BillBLS_Info_Unsettled_Driver.drive(new BillBLS_Info_Unsettled_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "get UnsettledBill() successfully\r\n", expectedString);
	}
}
