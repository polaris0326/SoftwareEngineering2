package blservice_driver.clientblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import blservice_stub.clientblservice_stub.ClientBLService_Transfer_Stub;

public class ClientBLService_Transfer_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ClientBLService_Transfer_Driver clientBLService_Transfer_Driver=new ClientBLService_Transfer_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		clientBLService_Transfer_Driver.drive(new ClientBLService_Transfer_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Past limit is done\r\n"
				+"Payable change success\r\n"
				+"Receivable change success\r\n", expectedString);
	}

}
