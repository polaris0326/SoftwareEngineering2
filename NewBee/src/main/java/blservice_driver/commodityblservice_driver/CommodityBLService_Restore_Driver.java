package blservice_driver.commodityblservice_driver;

import blservice.commodityblservice.CommodityBLService_Restore;
import po.CommodityTreePO;

public class CommodityBLService_Restore_Driver{
	public void drive(CommodityBLService_Restore commodityBLService_Restore){
		commodityBLService_Restore.restore(new CommodityTreePO(null));
		
	}

}