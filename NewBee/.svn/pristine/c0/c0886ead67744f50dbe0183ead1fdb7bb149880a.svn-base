package blservice.billblservice;

import java.util.ArrayList;
import java.util.Date;
import po.ImportBillPO;
import po.SalesBillPO;

public interface BillBLS_Info_Import {
	
	public ArrayList<SalesBillPO> getImportRecordByTime(Date d1, Date d2);
	
	//为进货人员提供未被退货的进货单据历史.即经过批准的进货单据，而且没有与之对应的进货退货单据被批准
	
	public ImportBillPO findImportBill(String billID);
	

}
