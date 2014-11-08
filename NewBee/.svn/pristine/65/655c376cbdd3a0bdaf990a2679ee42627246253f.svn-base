package blservice_driver.adminblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;
import blservice_stub.adminblservice_stub.AdminBLS_UserManage_Stub;

public class AdminBLS_UserManage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AdminBLS_UserManage_Driver adminBLS_UserManage_Driver=new AdminBLS_UserManage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		adminBLS_UserManage_Driver.drive(new AdminBLS_UserManage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Add User Successfully\r\n"
				+ "Modify User Successfully\r\n"
				+ "Delete User Successfully\r\n"
				+ "Get Userlist Successfully\r\n", expectedString);
	}

}
