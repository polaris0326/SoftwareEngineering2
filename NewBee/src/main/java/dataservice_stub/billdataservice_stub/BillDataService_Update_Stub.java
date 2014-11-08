package dataservice_stub.billdataservice_stub;

import java.util.ArrayList;

import dataservice.billdataservice.BillDataService_Update;
import po.BillPO;

public class BillDataService_Update_Stub implements BillDataService_Update{
	
	public ArrayList<BillPO> getUnsettled (){
		return new ArrayList<BillPO>();
	}

}
