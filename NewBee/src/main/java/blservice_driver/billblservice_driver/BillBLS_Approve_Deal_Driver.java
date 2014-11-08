package blservice_driver.billblservice_driver;

import blservice.billblservice.BillBLS_Approve_Deal;

public class BillBLS_Approve_Deal_Driver{
	public void drive(BillBLS_Approve_Deal billBLS_Approve_Deal){
		if(billBLS_Approve_Deal.approveSale("id", 0)){
			System.out.println("approve Sale successfully");
		}
		billBLS_Approve_Deal.approveImport("id");
	}
	
}
