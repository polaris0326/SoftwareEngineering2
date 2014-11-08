package dataservice_driver.userdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.userdataservice_stub.UserDataService_PWVerify_Stub;

public class UserDataService_PWVerify_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		UserDataService_PWVerify_Driver userDataService_PWVerify_Driver =new UserDataService_PWVerify_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		userDataService_PWVerify_Driver.drive(new UserDataService_PWVerify_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Verify Password Successfully\r\n",expectedString);
	}

}
