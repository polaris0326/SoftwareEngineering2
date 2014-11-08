package blservice_driver.commodityblservice_driver;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.adminblservice_stub.AdminBLS_ChangePW_Stub;
import blservice_stub.commodityblservice_stub.CommodityBLService_CheckCom_Stub;

public class CommodityBLService_CheckCom_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CommodityBLService_CheckCom_Driver commodityBLService_CheckCom_Driver=new CommodityBLService_CheckCom_Driver();
		
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		commodityBLService_CheckCom_Driver.drive(new CommodityBLService_CheckCom_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		System.out.print(expectedString);
		assertEquals("Check Commodity Successfully\r\n"
				+ "Export Excel Successfully\r\n", expectedString);
	}

}
