package dataservice_driver.cilentdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import dataservice_stub.clientdataservice_stub.ClientDataService_Manage_Stub;

public class ClientDataService_Manage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ClientDataService_Manage_Driver clientDataService_Manage_Driver =new ClientDataService_Manage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		clientDataService_Manage_Driver.drive(new ClientDataService_Manage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Search successfully\r\n"
				+ "Insert successfully\r\n"
				+ "Delete successfully\r\n"
				+ "Update successfully\r\n",expectedString);
	}

}
