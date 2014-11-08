package blservice.billblservice;

import java.util.ArrayList;
import java.util.Date;

import vo.BillVO;

public interface BillBLS_Info_ApprovedBill {
	
	public ArrayList<BillVO> getApprovedBill(Date d1,Date d2,String billType);
	//返回一段时间内某类通过单据列表,财务人员用

}
