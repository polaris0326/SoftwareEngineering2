package dataservice_driver.commoditydataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.commoditydataservice_stub.CommodityDataService_Find_Stub;

public class CommodityDataService_Find_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityDataService_Find_Driver commodityDataService_Find_Driver =new CommodityDataService_Find_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityDataService_Find_Driver.drive(new CommodityDataService_Find_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Find Successfully\r\n",expectedString);
	}

}
