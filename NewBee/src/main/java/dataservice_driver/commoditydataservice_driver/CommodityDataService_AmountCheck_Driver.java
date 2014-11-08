package dataservice_driver.commoditydataservice_driver;

import dataservice.commoditydataservice.CommodityDataService_AmountCheck;

public class CommodityDataService_AmountCheck_Driver{
	public void drive(CommodityDataService_AmountCheck commodityDataService_AmountCheck){
		if(commodityDataService_AmountCheck.isEnough("xyz", 100))
			System.out.println("Check Amount Enough Successfully");
	}

}
