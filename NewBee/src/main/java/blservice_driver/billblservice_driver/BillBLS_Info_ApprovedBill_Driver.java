package blservice_driver.billblservice_driver;

import blservice.billblservice.BillBLS_Info_ApprovedBill;

public class BillBLS_Info_ApprovedBill_Driver{
	public void drive(BillBLS_Info_ApprovedBill billBLS_Info_ApprovedBill){
		if(billBLS_Info_ApprovedBill.getApprovedBill(null, null).add(null)){
			System.out.println("get ApprovedBill successfully");
		}
	}
}
