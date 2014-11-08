package dataservice_driver.strategydataservice_driver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.strategydataservice_stub.StrategyDataService_ClientStrategy_Stub;

public class StrategyDataService_ClientStrategy_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		StrategyDataService_ClientStrategy_Driver StrategyDataService_ClientStrategy_Driver = new StrategyDataService_ClientStrategy_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		StrategyDataService_ClientStrategy_Driver.drive(new StrategyDataService_ClientStrategy_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("get ClientRebateStrategy successfully\r\n"
				+ "get ClientVoucherStrategy successfully\r\n"+"Success!\r\n" + "Success!\r\n"
				, expectedString);
	}
}
