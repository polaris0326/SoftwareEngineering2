package blservice_driver.salesblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.salesblservice_stub.SalesBLS_Add_Stub;

public class SalesBLS_Add_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SalesBLS_Add_Driver salesBLS_Add_Driver =new SalesBLS_Add_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		salesBLS_Add_Driver.drive(new SalesBLS_Add_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Get commodity successfully\r\n"
				+ "Get client list successfully\r\n"
				+ "Add successfully\r\n"
				+ "Delete successfully\r\n"
				+ "Submit sales bill successfully\r\n",expectedString);
	}

}
