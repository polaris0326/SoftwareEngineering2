package dataservice_driver.strategydataservice_driver;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dataservice_stub.strategydataservice_stub.StrategyDataService_Pack_Stub;

public class StrategyDataService_Pack_DriverTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		StrategyDataService_Pack_Driver StrategyDataService_Pack_Driver = new StrategyDataService_Pack_Driver();
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
		// cache stream
		PrintStream cacheStream = new PrintStream(baoStream);
		// old stream
		PrintStream oldStream = System.out;

		System.setOut(cacheStream);

		StrategyDataService_Pack_Driver.drive(new StrategyDataService_Pack_Stub());
		String expectedString = baoStream.toString();
		System.setOut(oldStream);
		assertEquals("get Pack successfully\r\n"
				+ "Success!\r\n", expectedString);
	}
}
