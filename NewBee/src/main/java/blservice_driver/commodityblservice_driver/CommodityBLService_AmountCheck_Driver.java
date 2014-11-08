package blservice_driver.commodityblservice_driver;

import blservice.commodityblservice.CommodityBLService_AmountCheck;

public class CommodityBLService_AmountCheck_Driver{
	public void drive(CommodityBLService_AmountCheck commodityBLService_AmountCheck){
		if(commodityBLService_AmountCheck.isComEnough("10", 100))
			System.out.println("Check Whether Commodity Enough Successfully");
	}

}
