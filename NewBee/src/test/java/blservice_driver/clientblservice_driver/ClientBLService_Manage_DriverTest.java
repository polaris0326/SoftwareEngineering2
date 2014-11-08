package blservice_driver.clientblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.clientblservice_stub.ClientBLService_Manage_Stub;

public class ClientBLService_Manage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ClientBLService_Manage_Driver clientBLService_Manage_Driver=new ClientBLService_Manage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		clientBLService_Manage_Driver.drive(new ClientBLService_Manage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Add Client Successfully\r\n"
				+ "Delete Client Successfully\r\n"
				+ "Modify Client Successfully\r\n"
				+ "Search Client Successfully\r\n", expectedString);
	}

}
