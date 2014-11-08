package dataservice_driver.commoditydataservice_driver;


import dataservice.commoditydataservice.CommodityDataService_TypeManage;

public class CommodityDataService_TypeManage_Driver{
	public void drive(CommodityDataService_TypeManage commodityDataService_TypeManage){
		if(commodityDataService_TypeManage.insertType(null, null))
			System.out.println("Insert Type Successfully");
		
		if(commodityDataService_TypeManage.deleteType(null))
			System.out.println("Delete Type Successfully");
		
		if(commodityDataService_TypeManage.updateType(null, null))
			System.out.println("Update Type Successfully");
	}
	

	

}
