package blservice_stub.billblservice_stub;

import java.util.ArrayList;
import java.util.Date;

import blservice.billblservice.BillBLS_Info_Sales;
import vo.SalesBillVO;

public class BillBLS_Info_Sales_Stub implements BillBLS_Info_Sales{
	
	public ArrayList<SalesBillVO> getSalesRecordByTime(Date d1, Date d2){
		return new ArrayList<SalesBillVO>();
	}
	
	//返回一段时间内所有经过批准的销售单据，即销售历史记录

}
