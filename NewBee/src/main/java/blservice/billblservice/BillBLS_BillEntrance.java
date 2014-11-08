package blservice.billblservice;

import po.BillPO;


public interface BillBLS_BillEntrance {
	//所有需要提交单据的bl模块使用此接口提交单据，返回提交成功与否。
	public boolean submitBill(BillPO po);
	

}
