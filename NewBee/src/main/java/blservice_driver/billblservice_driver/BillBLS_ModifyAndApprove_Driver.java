package blservice_driver.billblservice_driver;

import blservice.billblservice.BillBLS_ModifyAndApprove;


public class BillBLS_ModifyAndApprove_Driver{
	public void drive(BillBLS_ModifyAndApprove billBLS_ModifyAndApprove){
		if(billBLS_ModifyAndApprove.modifyAndApprove(null)){
			System.out.println("modify AndApprovetsuccessfully");
		}
	}

}
