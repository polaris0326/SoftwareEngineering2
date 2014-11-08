package blservice_driver.accountblservice_driver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.accountblservice_stub.AccountBLService_Manage_Stub;

public class AccountBLService_Manage_DriverTest {

		@Before
		public void setUp() throws Exception {
		}

		@Test
		public void test() {
			AccountBLService_Manage_Driver accountBLService_Manage_Driver = new AccountBLService_Manage_Driver();
			ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
			// cache stream
			PrintStream cacheStream = new PrintStream(baoStream);
			// old stream
			PrintStream oldStream = System.out;

			System.setOut(cacheStream);

			accountBLService_Manage_Driver
					.drive(new AccountBLService_Manage_Stub());
			String expectedString = baoStream.toString();
			System.setOut(oldStream);
			assertEquals("add Account successfully\r\n"
					+ "delete Account successfully\r\n"
					+ "modify Account successfully\r\n"
					+ "search Account successfully\r\n", expectedString);
		}
}
