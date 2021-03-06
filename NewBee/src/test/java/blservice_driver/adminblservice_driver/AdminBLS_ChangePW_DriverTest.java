package blservice_driver.adminblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;

public class AdminBLS_ChangePW_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AdminBLS_ChangePW_Driver adminBLS_ChangePW_Driver=new AdminBLS_ChangePW_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		adminBLS_ChangePW_Driver.drive(new AdminBLS_ChangePW_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Change Password Successfully\r\n"	, expectedString);
	}

}
