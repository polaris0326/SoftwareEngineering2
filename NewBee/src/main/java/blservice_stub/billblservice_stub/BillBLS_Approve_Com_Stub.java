package blservice_stub.billblservice_stub;

import blservice.billblservice.BillBLS_Approve_Com;

public class BillBLS_Approve_Com_Stub implements BillBLS_Approve_Com{
	
	public boolean approvePresent(String id){
		return true;
	}
	//检查商品库存量是否充足，若不足，返回false，单据保持未决状态。若充足，返回true，使商品的库存量减少赠送数量，将单据标记改为被通过
	public boolean approveComCorrect(String id){
		return true;
	}
	//若为报溢，使商品数量增加报溢数量，将单据标记为被通过，返回rue。若为报损，检查商品库存量是否充足，若不足，返回false，单据保持未决状态。若充足，返回true，使商品的库存量减少报损数量，将单据标记改为被通过。
	public void approveSetWarningLine(String id){
		System.out.println("Success!");
	}
	//设置商品的警戒线为请求的数量，将单据标记改为被通过
	

}