package blservice_stub.billblservice_stub;

import java.util.ArrayList;
import java.util.Date;

import blservice.billblservice.BillBLS_Info_Search;
import vo.BillVO;

public class BillBLS_Info_Search_Stub implements BillBLS_Info_Search{
	
	public ArrayList<BillVO> searchBillRecord (Date d1, Date d2, String comName, 
			String clientName, String clerkName, String storage, String billType){
		return new ArrayList<BillVO>();
	}
	
	

}
