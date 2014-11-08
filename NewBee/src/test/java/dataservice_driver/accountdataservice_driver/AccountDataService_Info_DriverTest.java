package dataservice_driver.accountdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import dataservice_stub.accountdataservice_stub.AccountDataService_Info_Stub;

public class AccountDataService_Info_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AccountDataService_Info_Driver accountDataService_Info_Driver =new AccountDataService_Info_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		accountDataService_Info_Driver.drive(new AccountDataService_Info_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Get account successfully\r\n",expectedString);
	}

}
