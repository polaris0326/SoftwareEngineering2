package blservice_driver.billblservice_driver;

import blservice.billblservice.BillBLS_Approve_Finance;

public class BillBLS_Approve_Finance_Driver{
	public void drive(BillBLS_Approve_Finance billBLS_Approve_Finance){
		billBLS_Approve_Finance.approveReceipt("id");
		if(billBLS_Approve_Finance.approvePayment("id")){
			System.out.println("approve Payment successfully");
		}
	}

}
