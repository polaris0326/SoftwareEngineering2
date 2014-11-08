package dataservice_stub.commoditydataservice_stub;

import dataservice.commoditydataservice.CommodityDataService_AmountCheck;

public class CommodityDataService_AmountCheck_Stub implements CommodityDataService_AmountCheck{
	
	public boolean isEnough(String id, int amount){
	//常用方法，独立出来以减少带宽占用
		return true;
	}

}
