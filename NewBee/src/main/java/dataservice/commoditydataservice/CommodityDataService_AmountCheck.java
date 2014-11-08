package dataservice.commoditydataservice;

public interface CommodityDataService_AmountCheck {
	
	public boolean isEnough(String id, int amount);
	//常用方法，独立出来以减少带宽占用

}
