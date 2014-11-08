package blservice_driver.billblservice_driver;

import blservice.billblservice.BillBLS_BillEntrance;

public class BillBLS_BillEntrance_Driver{
	public void drive(BillBLS_BillEntrance billBLS_BillEntrance){
		if(billBLS_BillEntrance.submitBill(null)){
			System.out.println("submit Bill successfully");
		}
	}
}
