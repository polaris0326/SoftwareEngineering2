package blservice_driver.commodityblservice_driver;
import blservice.commodityblservice.CommodityBLService_CheckCom;

public class CommodityBLService_CheckCom_Driver{
	public void drive(CommodityBLService_CheckCom commodityBLService_CheckCom){
		commodityBLService_CheckCom.checkCom();
		System.out.println("Check Commodity Successfully");
		
		commodityBLService_CheckCom.exportExcel();
		
	}

	
}
