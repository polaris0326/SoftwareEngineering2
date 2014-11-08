package dataservice_driver.commoditydataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.commoditydataservice_stub.CommodityDataService_ComManage_Stub;

public class CommodityDataService_ComManage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityDataService_ComManage_Driver commodityDataService_ComManage_Driver =new CommodityDataService_ComManage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityDataService_ComManage_Driver.drive(new CommodityDataService_ComManage_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Insert Commodity Successfully\r\n"
				+ "Delete Commodity Successfully\r\n"
				+ "Update Commodity Successfully\r\n",expectedString);
	}

}
