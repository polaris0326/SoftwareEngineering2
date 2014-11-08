package blservice_driver.commodityblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;
import blservice_stub.commodityblservice_stub.CommodityBLService_Manage_Stub;

public class CommodityBLService_Manage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityBLService_Manage_Driver commodityBLService_Manage_Driver=new CommodityBLService_Manage_Driver();
		
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityBLService_Manage_Driver.drive(new CommodityBLService_Manage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Add Commodity Successfully\r\n"
				+ "Delete Commodity Successfully\r\n"
				+ "Modify Commodity Successfully\r\n"
				+ "Correct Commodity Successfully\r\n"
				+ "Submit SetWarninglinebill Successfully\r\n"
				+ "Search Commodity Successfully\r\n", expectedString);
	}

}
