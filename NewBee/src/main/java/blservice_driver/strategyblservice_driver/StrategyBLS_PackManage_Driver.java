package blservice_driver.strategyblservice_driver;

import java.util.ArrayList;
import java.util.Date;

import blservice.strategyblservice.StrategyBLS_PackManage;
import vo.PackVO;

public class StrategyBLS_PackManage_Driver {
	public void drive(StrategyBLS_PackManage strategyBLS_PackManage){
		strategyBLS_PackManage.addPackItem(null, 0);
		System.out.println("Add Successfully");
		strategyBLS_PackManage.delPackItem(null);
		System.out.println("Delete Successfully");
		if(strategyBLS_PackManage.addPackStrategy(null, null, 0))
			System.out.println("Add Successfully");
		strategyBLS_PackManage.getPackStrategyList();
		System.out.println("Get Successfully");
	}
	
}
