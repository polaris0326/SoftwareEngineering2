package dataservice_driver.accountdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import dataservice_stub.accountdataservice_stub.AccountDataService_Manage_Stub;

public class AccountDataService_Manage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AccountDataService_Manage_Driver accountDataService_Manage_Driver =new AccountDataService_Manage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		accountDataService_Manage_Driver.drive(new AccountDataService_Manage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Insert successfully\r\n"
				+ "Delete successfully\r\n"
				+ "Update successfully\r\n",expectedString);
	}

}
