package blservice_driver.billblservice_dirver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_driver.billblservice_driver.BillBLS_BillEntrance_Driver;
import blservice_stub.billblservice_stub.BillBLS_BillEntrance_Stub;

public class BillBLS_BillEntrance_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillBLS_BillEntrance_Driver billBLS_BillEntrance_Driver = new BillBLS_BillEntrance_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		billBLS_BillEntrance_Driver.drive(new BillBLS_BillEntrance_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("submit Bill successfully\r\n", expectedString);
	}
}
