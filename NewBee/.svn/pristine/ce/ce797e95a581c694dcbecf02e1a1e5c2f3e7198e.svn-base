package blservice_driver.accountblservice_driver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.accountblservice_stub.AccountBLService_Info_Stub;


public class AccountBLService_Info_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AccountBLService_Info_Driver accountBLService_Info_Driver=new AccountBLService_Info_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

	        accountBLService_Info_Driver.drive(new AccountBLService_Info_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "get AccountList successfully\r\n"
				     +"get ClientList successfully\r\n",expectedString);
	}

}
