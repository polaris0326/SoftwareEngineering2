package blservice_driver.billblservice_driver;

import blservice.billblservice.BillBLS_Info_Log;

public class BillBLS_Info_Log_Driver{
	public void drive(BillBLS_Info_Log billBLS_Info_Log){
		if(billBLS_Info_Log.getLog(null, null).add(null)){
			System.out.println("get Log successfully");
		}
	}

}
