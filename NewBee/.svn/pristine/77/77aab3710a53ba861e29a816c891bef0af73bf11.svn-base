package dataservice_driver.commoditydataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.commoditydataservice_stub.CommodityDataService_TypeManage_Stub;

public class CommodityDataService_TypeManage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
			CommodityDataService_TypeManage_Driver commodityDataService_TypeManager_Driver =new CommodityDataService_TypeManage_Driver();
			 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		        // cache stream
		        PrintStream cacheStream = new PrintStream(baoStream);
		        // old stream
		        PrintStream oldStream = System.out;
		 
		        System.setOut(cacheStream);

			commodityDataService_TypeManager_Driver.drive(new CommodityDataService_TypeManage_Stub());
			String expectedString=baoStream.toString();
			System.setOut(oldStream);
			assertEquals( "Insert Type Successfully\r\n"
					+ "Delete Type Successfully\r\n"
					+ "Update Type Successfully\r\n",expectedString);
	}

}
