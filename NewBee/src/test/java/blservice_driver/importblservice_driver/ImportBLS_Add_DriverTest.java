package blservice_driver.importblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import blservice_stub.importblservice_stub.ImportBLS_Add_Stub;

public class ImportBLS_Add_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ImportBLS_Add_Driver importBLS_Add_Driver =new ImportBLS_Add_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		importBLS_Add_Driver.drive(new ImportBLS_Add_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Get commodity successfully\r\n"
				+ "Get client list successfully\r\n"
				+ "Add successfully\r\n"
				+ "Delete successfully\r\n"
				+ "Submit import bill successfully\r\n",expectedString);
	}


}
