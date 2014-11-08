package blservice_driver.clientblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import blservice_stub.clientblservice_stub.ClientBLService_Restore_Stub;

public class ClientBLService_Restore_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ClientBLService_Restore_Driver clientBLService_Restore_Driver=new ClientBLService_Restore_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		clientBLService_Restore_Driver.drive(new ClientBLService_Restore_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Restore successfully\r\n", expectedString);
	}

}
