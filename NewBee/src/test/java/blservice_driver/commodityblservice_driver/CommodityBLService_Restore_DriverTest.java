package blservice_driver.commodityblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;
import blservice_stub.commodityblservice_stub.CommodityBLService_Restore_Stub;

public class CommodityBLService_Restore_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityBLService_Restore_Driver commodityBLService_Restore_Driver=new CommodityBLService_Restore_Driver();
		
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityBLService_Restore_Driver.drive(new CommodityBLService_Restore_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals("Restore Successfully\r\n", expectedString);
	}

}
