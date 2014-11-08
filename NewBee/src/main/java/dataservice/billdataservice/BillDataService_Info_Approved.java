package dataservice.billdataservice;

import java.util.ArrayList;
import java.util.Date;

import po.BillPO;

public interface BillDataService_Info_Approved {
	
	public ArrayList<BillPO> getApprovedBillByTime(Date d1,Date d2,String billType);
	//返回一段时间内某种类型的单据，若billtype为空表示无要求 

}
