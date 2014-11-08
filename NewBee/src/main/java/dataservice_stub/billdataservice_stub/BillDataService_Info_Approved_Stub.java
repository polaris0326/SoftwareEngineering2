package dataservice_stub.billdataservice_stub;

import java.util.ArrayList;
import java.util.Date;

import dataservice.billdataservice.BillDataService_Info_Approved;
import po.BillPO;

public class BillDataService_Info_Approved_Stub implements BillDataService_Info_Approved{
	
	public ArrayList<BillPO> getApprovedBillByTime(Date d1,Date d2,String billType){
		return new ArrayList<BillPO>();
	}
	//返回一段时间内某种类型的单据，若billtype为空表示无要求 

}
