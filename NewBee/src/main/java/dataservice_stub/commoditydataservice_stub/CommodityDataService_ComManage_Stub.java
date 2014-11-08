package dataservice_stub.commoditydataservice_stub;

import dataservice.commoditydataservice.CommodityDataService_ComManage;
import po.CommodityPO;
import po.TypePO;

public class CommodityDataService_ComManage_Stub implements CommodityDataService_ComManage{
	
	public boolean insertCom(CommodityPO com, TypePO type){
		return true;
	}
	public boolean deleteCom(String id){
		return true;
	}
	public boolean updateCom(String id, CommodityPO po){
		return true;
	}
	

}
