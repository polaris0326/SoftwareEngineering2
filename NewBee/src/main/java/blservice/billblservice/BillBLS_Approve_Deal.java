package blservice.billblservice;

public interface BillBLS_Approve_Deal {
	
	//用到client的transferhandle和commoditybl的dealhandle
	
	public boolean approveSaleAdd(String id, int moreRebate);
	//对于销售单若moreRebate大于应付额则返回false。否则，检查商品数量是否充足，若有任何商品不充足，返回false。若均充足，
	//检查客户应收额度是否超过，若超过，返回false。
	//若均检查通过，改变商品数量和客户应收额，将单据标记改为被通过。
	
	public void approveSaleDel(String id);
	//销售退货单，查询销售历史，恢复最近售价，恢复赠品数量，恢复库存数量和客户应收额度
	
	public void approveImportAdd(String id);
	//改变商品数量和客户应付额，将单据标记改为被通过
	
	public boolean approveImportDel(String id);
	//若为进货退货单，需要检查库存数量是否足够，若充足，恢复最近进价，恢复库存数量和客户应收额度
	
}
