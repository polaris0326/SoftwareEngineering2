package dataservice.billdataservice;

import java.util.ArrayList;
import java.util.Date;

import po.BillPO;

public interface BillDataService_Info_Search {
	
	public ArrayList<BillPO> searchBillRecord(Date d1, Date d2, String comName, String clientName, 
			String clerkName, String storage, String billType);
	
	

}
