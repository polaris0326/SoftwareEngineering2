package blservice_driver.billblservice_dirver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_driver.billblservice_driver.BillBLS_ChangeHandle_Account_Driver;
import blservice_stub.billblservice_stub.BillBLS_ChangeHandle_Account_Stub;


public class BillBLS_ChangeHandle_Account_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BillBLS_ChangeHandle_Account_Driver billBLS_ChangeHandle_Account_Driver = new BillBLS_ChangeHandle_Account_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		billBLS_ChangeHandle_Account_Driver.drive(new BillBLS_ChangeHandle_Account_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("Success!\r\n" , expectedString);
	}
}
