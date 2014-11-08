package dataservice_driver.accountdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import dataservice_stub.accountdataservice_stub.AccountDataService_Final_Stub;

public class AccountDataService_Final_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AccountDataService_Final_Driver accountDataService_Final_Driver =new AccountDataService_Final_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		accountDataService_Final_Driver.drive(new AccountDataService_Final_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Add business condition successfully!\r\n"
				+ "Get final business condition successfully\r\n",expectedString);
	}

}
