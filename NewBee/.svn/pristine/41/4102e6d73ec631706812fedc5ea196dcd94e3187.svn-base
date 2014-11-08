package dataservice_driver.strategydataservice_driver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.strategydataservice_stub.StrategyDataService_Present_Stub;

public class StrategyDataService_Present_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		StrategyDataService_Present_Driver StrategyDataService_Present_Driver = new StrategyDataService_Present_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		StrategyDataService_Present_Driver.drive(new StrategyDataService_Present_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("get PresentStrategy successfully\r\n"
				+ "Success!\r\n", expectedString);
	}
}
