package dataservice_driver.commoditydataservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.commoditydataservice_stub.CommodityDataService_AmountCheck_Stub;

public class CommodityDataService_AmountCheck_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityDataService_AmountCheck_Driver commodityDataService_AmountCheck_Driver =new CommodityDataService_AmountCheck_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityDataService_AmountCheck_Driver.drive(new CommodityDataService_AmountCheck_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Check Amount Enough Successfully\r\n",expectedString);
	}

}
