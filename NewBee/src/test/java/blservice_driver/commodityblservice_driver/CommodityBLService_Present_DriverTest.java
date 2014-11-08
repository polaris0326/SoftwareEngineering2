package blservice_driver.commodityblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;
import blservice_stub.commodityblservice_stub.CommodityBLService_Present_Stub;

public class CommodityBLService_Present_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityBLService_Present_Driver commodityBLService_Present_Driver=new CommodityBLService_Present_Driver();
		
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityBLService_Present_Driver.drive(new CommodityBLService_Present_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Add Present Commodity Successfully\r\n"
				+ "Delete present Commodity Successfully\r\n"
				+ "Submit Presentbill Successfully\r\n", expectedString);
	}

}
