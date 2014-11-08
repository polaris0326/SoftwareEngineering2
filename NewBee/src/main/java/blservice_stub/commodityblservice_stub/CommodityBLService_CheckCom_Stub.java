package blservice_stub.commodityblservice_stub;
import java.util.*;

import blservice.commodityblservice.CommodityBLService_CheckCom;
import vo.CheckComInfoVO;

public class CommodityBLService_CheckCom_Stub implements CommodityBLService_CheckCom{
	public ArrayList<CheckComInfoVO>checkCom(){
	//返回从期初截至当天的库存盘点信息
		return new ArrayList<CheckComInfoVO>();
	}
	
	public void exportExcel(){
	//将从期初截至当天的库存盘点信息导出到EXCEL文档保存在系统根目录下
		System.out.println("Export Excel Successfully");
	}
	
}
