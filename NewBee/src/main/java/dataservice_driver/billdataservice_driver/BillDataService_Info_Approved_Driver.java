package dataservice_driver.billdataservice_driver;

import dataservice.billdataservice.BillDataService_Info_Approved;


public class BillDataService_Info_Approved_Driver{
	public void drive(BillDataService_Info_Approved billDataService_Info_Approved){
		if(billDataService_Info_Approved.getApprovedBillByTime(null, null, "billType").add(null)){
			System.out.println("get ApprovedBillByTime successfully");
		}
	}
}
