package blservice_driver.logblservice_driver;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import blservice_stub.logblservice_stub.LogBLS_Stub;

public class LogBLS_DriverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		LogBLS_Driver logBLS_Driver =new LogBLS_Driver();
		 ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
	        // cache stream
	        PrintStream cacheStream = new PrintStream(baoStream);
	        // old stream
	        PrintStream oldStream = System.out;
	 
	        System.setOut(cacheStream);

		logBLS_Driver.drive(new LogBLS_Stub());
		String expectedString=baoStream.toString();
		System.setOut(oldStream);
		assertEquals( "Check log successfully\r\n",expectedString);
	}

}
