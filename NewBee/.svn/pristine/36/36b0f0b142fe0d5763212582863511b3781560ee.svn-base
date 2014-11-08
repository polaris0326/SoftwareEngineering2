package dataservice_driver.cilentdataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.clientdataservice_stub.ClientDataService_Find_Stub;

public class ClientDataServie_Find_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ClientDataService_Find_Driver clientDataService_Find_Driver =new ClientDataService_Find_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		clientDataService_Find_Driver.drive(new ClientDataService_Find_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Find successfully\r\n",expectedString);
	}

}
