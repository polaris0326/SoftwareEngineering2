package blservice_driver.accountblservice_driver;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.accountblservice_stub.AccountBLService_BusinessCondition_Stub;


public class AccountBLService_BusinessCondition_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AccountBLService_BusinessCondition_Driver accountBLService_BusinessCondition_Driver=new AccountBLService_BusinessCondition_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

	        accountBLService_BusinessCondition_Driver.drive(new AccountBLService_BusinessCondition_Stub());
		System.setOut(oldStream);
	}

}
