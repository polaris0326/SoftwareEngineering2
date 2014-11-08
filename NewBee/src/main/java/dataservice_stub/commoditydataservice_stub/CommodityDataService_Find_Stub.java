package dataservice_stub.commoditydataservice_stub;

import dataservice.commoditydataservice.CommodityDataService_Find;
import po.CommodityPO;

public class CommodityDataService_Find_Stub implements CommodityDataService_Find{
	
	public CommodityPO find(String id){
		return new CommodityPO("abc", "abc", "abc", 10, 10, 10, 10, 10);
	}
	

}
