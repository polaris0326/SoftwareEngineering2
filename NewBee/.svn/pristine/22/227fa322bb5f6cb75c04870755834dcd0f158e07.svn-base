package dataservice_driver.billdataservice_driver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.billdataservice_stub.BillDataService_Info_Search_Stub;
public class BillDataService_Info_Search_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillDataService_Info_Search_Driver BillDataService_Info_Search_Driver = new BillDataService_Info_Search_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		BillDataService_Info_Search_Driver.drive(new BillDataService_Info_Search_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("search BillRecord successfully\r\n", expectedString);
	}
}
