package blservice_driver.commodityblservice_driver;

import blservice.commodityblservice.CommodityBLService_StockCheck;

public class CommodityBLService_StockCheck_Driver{
	public void drive(CommodityBLService_StockCheck commodityBLService_StockCheck){
		commodityBLService_StockCheck.stockCheck(null, null);
		System.out.println("Check Stock Successfully");
	}

}
