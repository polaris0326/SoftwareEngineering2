package blservice.commodityblservice;

public interface CommodityBLService_AmountHandle {
	
	public boolean isComEnough(String id,int amount);
	public void comAmountChange(String id, int offset);

}
