package dataservice_driver.commoditydataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.commoditydataservice_stub.CommodityDataService_Info_Stub;

public class CommodityDataService_Info_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityDataService_Info_Driver commodityDataService_Info_Driver =new CommodityDataService_Info_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityDataService_Info_Driver.drive(new CommodityDataService_Info_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Get Commodity Tree Successfully\r\n",expectedString);
	}

}
