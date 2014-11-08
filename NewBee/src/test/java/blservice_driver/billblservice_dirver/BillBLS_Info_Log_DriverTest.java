package blservice_driver.billblservice_dirver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_driver.billblservice_driver.BillBLS_Info_Log_Driver;
import blservice_stub.billblservice_stub.BillBLS_Info_Log_Stub;



public class BillBLS_Info_Log_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillBLS_Info_Log_Driver billBLS_Info_Log_Driver = new BillBLS_Info_Log_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		billBLS_Info_Log_Driver.drive(new BillBLS_Info_Log_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("get Log successfully\r\n", expectedString);
	}
}
