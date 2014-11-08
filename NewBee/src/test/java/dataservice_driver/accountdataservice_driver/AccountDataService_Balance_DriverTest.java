package dataservice_driver.accountdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.accountdataservice_stub.AccountDataService_Balance_Stub;

public class AccountDataService_Balance_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AccountDataService_Balance_Driver accountDataService_Balance_Driver =new AccountDataService_Balance_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		accountDataService_Balance_Driver.drive(new AccountDataService_Balance_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "It is enough\r\n",expectedString);
	}

}
