package blservice_stub.commodityblservice_stub;

import blservice.commodityblservice.CommodityBLService_Info;
import vo.CommodityTreeVO;

public class CommodityBLService_Info_Stub implements CommodityBLService_Info{
	
	public CommodityTreeVO getComTree(){
	//返回所有商品的树
		return new CommodityTreeVO();
	}
	
}
