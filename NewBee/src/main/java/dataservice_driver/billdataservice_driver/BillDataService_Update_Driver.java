package dataservice_driver.billdataservice_driver;

import dataservice.billdataservice.BillDataService_Update;

public class BillDataService_Update_Driver{
	public void drive(BillDataService_Update billDataService_Update){
		if(billDataService_Update.getUnsettled().add(null)){
			System.out.println("get Unsettled successfully");
		}
	}


}
