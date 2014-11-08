package blservice_stub.commodityblservice_stub;

import blservice.commodityblservice.CommodityBLService_AmountChange;

public class CommodityBLService_AmountChange_Stub implements CommodityBLService_AmountChange{
	
	public void comAmountChange(String id, int offset){
	//商品的库存量增加或减少，取决于offset的正负
		System.out.println("Change Commodity Amount Successfully");
	}

}
