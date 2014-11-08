package blservice_driver.commodityblservice_driver;

import blservice.commodityblservice.CommodityBLService_TypeManage;
public class CommodityBLService_TypeManage_Driver{
	public void drive(CommodityBLService_TypeManage commodityBLService_TypeManage){
		if(commodityBLService_TypeManage.addType(null, "xyzz"))
			System.out.println("Add Type Successfully");
		if(commodityBLService_TypeManage.deleteType(null))
			System.out.println("Delete Type Successfully");
		
		if(commodityBLService_TypeManage.modifyType(null, "xy"))
			System.out.println("Modify Type Successfully");
	}
	
}
