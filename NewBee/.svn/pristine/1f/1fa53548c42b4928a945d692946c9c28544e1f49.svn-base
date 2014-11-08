package blservice.billblservice;

import java.util.ArrayList;
import java.util.Date;
import po.SalesBillPO;

public interface BillBLS_Info_Sales {
	
	public ArrayList<SalesBillPO> getSalesRecordByTime(Date d1, Date d2);
	
	//为销售人员提供未被退货的销售单据历史.即经过批准的销售单据，而且没有与之对应的销售退货单据被批准

	public SalesBillPO findSalesBill(String billID);
}
