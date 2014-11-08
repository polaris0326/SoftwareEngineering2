package blservice.billblservice;

public interface BillBLS_Approve_Finance {
	
	//用到client和account的handle
	
	public void approveReceipt(String id);
	//减少对应客户应收额，增加包含账户总额，将单据标记为被通过
	public boolean approvePayment(String id);
	//检查账户余额是否均充足，若有不足以支付的，返回false。若均充足，减少对应客户应付额，减少包含账户余额，将单据标记改为被通过
	
	public boolean approveCash(String id);
	//检查账户余额是否均充足，若有不足以支付的，返回false。若均充足，减少包含账户余额，将单据标记为通过
	

}
