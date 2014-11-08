package blservice_driver.strategyblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.clientblservice_stub.ClientBLService_Info_Stub;
import blservice_stub.strategyblservice_stub.StrategyBLS_PackManage_stub;

public class StrategyBLS_PackManage_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		StrategyBLS_PackManage_Driver strategyBLS_PackManage_Driver=new StrategyBLS_PackManage_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		strategyBLS_PackManage_Driver.drive(new StrategyBLS_PackManage_stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Add Successfully\r\n"
				+"Delete Successfully\r\n"
				+"Add Successfully\r\n"
				+"Get Successfully\r\n",expectedString);
	}

}