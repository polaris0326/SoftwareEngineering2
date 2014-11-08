package blservice_driver.accountblservice_driver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.accountblservice_stub.AccountBLService_SalesDetail_Stub;

public class AccountBLService_SalesDetail_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AccountBLService_SalesDetail_Driver accountBLService_SalesDetail_Driver = new AccountBLService_SalesDetail_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		accountBLService_SalesDetail_Driver
				.drive(new AccountBLService_SalesDetail_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("Success!\r\n" + "get salesDetail successfully\r\n",
				expectedString);
	}
}
