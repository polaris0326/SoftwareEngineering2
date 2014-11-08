package blservice_driver.billblservice_dirver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_driver.billblservice_driver.BIllBLS_Clear_Driver;
import blservice_stub.billblservice_stub.BIllBLS_Clear_Stub;

public class BIllBLS_Clear_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BIllBLS_Clear_Driver bIllBLS_Clear_Driver = new BIllBLS_Clear_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		bIllBLS_Clear_Driver.drive(new BIllBLS_Clear_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("Success!\r\n" , expectedString);
	}
}
