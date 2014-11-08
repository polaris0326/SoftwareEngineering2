package blservice.billblservice;

import java.util.ArrayList;
import java.util.Date;

import po.BillPO;

public interface BillBLS_Info_Search {
	
	//查看单据历史（有红冲的那个）用的,所以需要提供根据单据编号找到单据PO的功能
	public ArrayList<BillPO> searchBillRecord (Date d1, Date d2, String comName, 
			String clientName, String clerkName, String storage, String billType);
	
	public BillPO findBill(String billID);
}
