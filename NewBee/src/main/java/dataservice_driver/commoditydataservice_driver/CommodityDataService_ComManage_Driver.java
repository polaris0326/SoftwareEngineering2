package dataservice_driver.commoditydataservice_driver;

import dataservice.commoditydataservice.CommodityDataService_ComManage;

public class CommodityDataService_ComManage_Driver{
	public void drive(CommodityDataService_ComManage comManage){
		if(comManage.insertCom(null, null))
			System.out.println("Insert Commodity Successfully");
		
		if(comManage.deleteCom(null))
			System.out.println("Delete Commodity Successfully");
		
		if(comManage.updateCom(null, null))
			System.out.println("Update Commodity Successfully");
		
	}


}