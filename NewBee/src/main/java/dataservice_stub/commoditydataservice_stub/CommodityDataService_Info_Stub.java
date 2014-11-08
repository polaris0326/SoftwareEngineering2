package dataservice_stub.commoditydataservice_stub;

import dataservice.commoditydataservice.CommodityDataService_Info;
import po.CommodityTreePO;

public class CommodityDataService_Info_Stub implements CommodityDataService_Info{
	
	public CommodityTreePO getCommodityTree(){
		return new CommodityTreePO(null);
	}

}
