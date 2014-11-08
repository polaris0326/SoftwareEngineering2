package dataservice_driver.cilentdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import dataservice_stub.clientdataservice_stub.ClientDataService_Restore_Stub;

public class ClientDataService_Restore_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ClientDataService_Restore_Driver clientDataService_Restore_Driver =new ClientDataService_Restore_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		clientDataService_Restore_Driver.drive(new ClientDataService_Restore_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Restore successfully\r\n",expectedString);
	}

}
