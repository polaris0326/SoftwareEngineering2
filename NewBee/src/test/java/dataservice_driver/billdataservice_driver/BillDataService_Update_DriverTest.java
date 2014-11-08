package dataservice_driver.billdataservice_driver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.billdataservice_stub.BillDataService_Update_Stub;

public class BillDataService_Update_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillDataService_Update_Driver BillDataService_Update_Driver = new BillDataService_Update_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		BillDataService_Update_Driver.drive(new BillDataService_Update_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "get Unsettled successfully\r\n", expectedString);
	}
}
