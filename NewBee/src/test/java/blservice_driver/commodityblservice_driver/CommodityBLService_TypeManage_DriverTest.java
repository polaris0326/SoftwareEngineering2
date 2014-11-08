package blservice_driver.commodityblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.commoditydataservice_stub.CommodityDataService_TypeManage_Stub;
import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;
import blservice_stub.commodityblservice_stub.CommodityBLService_TypeManage_Stub;

public class CommodityBLService_TypeManage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityBLService_TypeManage_Driver commodityBLService_TypeManage_Driver=new CommodityBLService_TypeManage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityBLService_TypeManage_Driver.drive(new CommodityBLService_TypeManage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Add Type Successfully\r\n"
				+ "Delete Type Successfully\r\n"
				+ "Modify Type Successfully\r\n", expectedString);
	}

}
