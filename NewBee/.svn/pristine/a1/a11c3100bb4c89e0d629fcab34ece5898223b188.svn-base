package blservice_driver.commodityblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;
import blservice_stub.commodityblservice_stub.CommodityBLService_AmountChange_Stub;

public class CommodityBLService_AmountChange_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityBLService_AmountChange_Driver commodityBLService_AmountChange_Driver=new CommodityBLService_AmountChange_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityBLService_AmountChange_Driver.drive(new CommodityBLService_AmountChange_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Change Commodity Amount Successfully\r\n", expectedString);
	}

}
