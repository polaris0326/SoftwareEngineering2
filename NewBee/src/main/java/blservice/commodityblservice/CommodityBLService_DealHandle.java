package blservice.commodityblservice;

public interface CommodityBLService_DealHandle {
	
	//新建进货批准通过，修改商品库存量和最近进价
	public void importAddHandle(String comID, int amount, double unit);
	
	//欲批准进货退货时，bill模块通过查询进货历史获取上一次进货单价，传递过来。检查商品现有量是否少于退货数量，若少于，返回false；
	//否则，还原最近进价
	public boolean importDelHandle(String comID, int amount, double  lastImportPrice);
	
	//欲批准新建销售时，判断现有库存量是否足够，若否，返回false。否则，修改商品库存量和最近售价
	public boolean salesAddHandle(String comID, int amount, double unit);
	
	//进货退货批准通过时，bill模块通过查询销售历史获取上一次销售单价，传递过来。改变商品的库存数量和最近进价
	public void salesDelHandle(String comID, int amount, double  lastImportPrice);
	

}
