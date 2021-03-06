package blservice_driver.userblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;
import blservice_stub.userblservice_stub.UserBLService_Logout_Stub;

public class UserBLService_Logout_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		UserBLService_Logout_Driver userBLService_Logout_Driver=new UserBLService_Logout_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		userBLService_Logout_Driver.drive(new UserBLService_Logout_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Logout Successfully\r\n", expectedString);
	}

}
