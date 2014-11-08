package dataservice_stub.billdataservice_stub;

import java.util.ArrayList;

import dataservice.billdataservice.BillDataService_Info_Unsettled;
import po.BillPO;

public class BillDataService_Info_Unsettled_Stub implements BillDataService_Info_Unsettled{
	
	
	public ArrayList<BillPO> getUnsettled (){
		return new ArrayList<BillPO>();
	}

}
