package blservice_driver.importblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.importblservice_stub.ImportBLS_Manage_Stub;

public class ImportBLS_Manage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ImportBLS_Manage_Driver importBLS_Manage_Driver =new ImportBLS_Manage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		importBLS_Manage_Driver.drive(new ImportBLS_Manage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Get import record successfully\r\n"
				+ "Delete import successfully\r\n",expectedString);
	}

}
