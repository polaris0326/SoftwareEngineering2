package blservice_driver.salesblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import blservice_stub.salesblservice_stub.SalesBLS_Manage_Stub;

public class SalesBLS_Manage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SalesBLS_Manage_Driver salesBLS_Manage_Driver =new SalesBLS_Manage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		salesBLS_Manage_Driver.drive(new SalesBLS_Manage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Get sales record successfully\r\n"
				+ "Delete sales successfully\r\n",expectedString);
	}

}
