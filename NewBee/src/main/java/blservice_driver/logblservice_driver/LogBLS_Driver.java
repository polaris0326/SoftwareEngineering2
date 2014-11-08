package blservice_driver.logblservice_driver;

import java.util.Date;

import blservice.logblservice.LogBLS;

public class LogBLS_Driver {

	public void drive(LogBLS logBLS){
		if(logBLS.checkLog(new Date(), new Date()).add(null)){
	    		System.out.println("Check log successfully");    	
		}
	}
}
