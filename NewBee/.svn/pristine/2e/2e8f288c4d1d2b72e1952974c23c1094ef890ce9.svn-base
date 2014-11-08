package dataservice_driver.userdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.userdataservice_stub.UserDataService_Manage_Stub;

public class UserDataService_Manage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		UserDataService_Manage_Driver userDataService_Manage_Driver =new UserDataService_Manage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		userDataService_Manage_Driver.drive(new UserDataService_Manage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Insert Successfully\r\n"
				+ "Delete Successfully\r\n"
				+ "Update Successfully\r\n"
				+ "Find Successfully\r\n"
				+ "Get Userlist Successfully\r\n",expectedString);
	}

}
